/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author aluno
 */
@Entity 
public class Aluno implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    private String nome; 
    private List<Atividade> atividade;
    private boolean isTaxaMatriculaPaga;
    private boolean isMensalidadePaga;
    private List<Mensalidade> mensalidades;

    public Aluno() {
        nome = "";
        atividade = new ArrayList<>();
        mensalidades  =  new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Atividade> getAtividade() {
        return atividade;
    }

    public void setAtividade(List<Atividade> atividade) {
        this.atividade = atividade;
    }

    public boolean isIsTaxaMatriculaPaga() {
        return isTaxaMatriculaPaga;
    }

    public void setIsTaxaMatriculaPaga(boolean isTaxaMatriculaPaga) {
        this.isTaxaMatriculaPaga = isTaxaMatriculaPaga;
    }

    public boolean isIsMensalidadePaga() {
        return isMensalidadePaga;
    }

    public void setIsMensalidadePaga(boolean isMensalidadePaga) {
        this.isMensalidadePaga = isMensalidadePaga;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
     
    public void matricula(Atividade atv){
        this.getAtividade().add(atv);
        Mensalidade nMensa = new Mensalidade();
        nMensa.setValor(atv.getMensalidade()*1.5);
        this.getMensalidades().add(nMensa);
    }

    List<Mensalidade> getMensalidades() {
       return this.mensalidades;
    }




    
}
