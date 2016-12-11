/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.bean;

import academiaPoliesportiva.model.Atividade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Filipe
 */
@Stateless
public class AtividadeFacade extends AbstractFacade<Atividade> {

    @PersistenceContext(unitName = "academiaPoliesportivaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AtividadeFacade() {
        super(Atividade.class);
    }
    
}
