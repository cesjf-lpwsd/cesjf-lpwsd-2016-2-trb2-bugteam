package academiaPoliesportiva.controller;

import academiaPoliesportiva.model.Aluno;
import academiaPoliesportiva.controller.util.JsfUtil;
import academiaPoliesportiva.controller.util.PaginationHelper;
import academiaPoliesportiva.bean.AlunoFacade;
import academiaPoliesportiva.model.Atividade;

import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

@Named("alunoController")
@SessionScoped
public class AlunoController implements Serializable {

    private Aluno alunoAtual;
    private DataModel items = null;
    @EJB
    private academiaPoliesportiva.bean.AlunoFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;
    private Atividade atividadeAtual;

    public AlunoController() {
    }

    public Aluno getSelected() {
        if (alunoAtual == null) {
            alunoAtual = new Aluno();
            selectedItemIndex = -1;
        }
        return alunoAtual;
    }

    private AlunoFacade getFacade() {
        return ejbFacade;
    }

    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {

                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }
    public String prepareListMensalidades() {
        recreateModel();
        return "ListaMensalidades";
    }

    public String prepareView() {
        alunoAtual = (Aluno) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        alunoAtual = new Aluno();
        selectedItemIndex = -1;
        return "Create";
    }
     public String prepareCreateMensalidades() {
        //alunoAtual = getItems();
       // atividadeAtual = new Atividade();
        
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "CriarMensalidades";
    }

    public String matricular() {
        try {
            alunoAtual.matricula(atividadeAtual);
            getFacade().edit(alunoAtual);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("AlunoUpdated"));
            return "ListarMatriculas";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }

    }

    public String create() {
        try {
            getFacade().create(alunoAtual);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("AlunoCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        alunoAtual = (Aluno) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(alunoAtual);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("AlunoUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        alunoAtual = (Aluno) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        performDestroy();
        recreatePagination();
        recreateModel();
        return "List";
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "View";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "List";
        }
    }

    private void performDestroy() {
        try {
            getFacade().remove(alunoAtual);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("AlunoDeleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            alunoAtual = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }

    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
        pagination = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "List";
    }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    public Aluno getAluno(java.lang.Long id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = Aluno.class)
    public static class AlunoControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            AlunoController controller = (AlunoController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "alunoController");
            return controller.getAluno(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Aluno) {
                Aluno o = (Aluno) object;
                return getStringKey(o.getId());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + Aluno.class.getName());
            }
        }

    }

    public Aluno getAlunoAtual() {
        return alunoAtual;
    }

    public void setAlunoAtual(Aluno alunoAtual) {
        this.alunoAtual = alunoAtual;
    }

    public Atividade getAtividadeAtual() {
        return atividadeAtual;
    }

    public void setAtividadeAtual(Atividade atividadeAtual) {
        this.atividadeAtual = atividadeAtual;
    }

}
