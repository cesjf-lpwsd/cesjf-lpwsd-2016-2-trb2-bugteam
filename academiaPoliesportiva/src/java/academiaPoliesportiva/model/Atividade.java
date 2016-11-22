/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author aluno
 */
@Entity 
public class Atividade implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)         
    private Long id;
    private String nome;
    private float mensalidade;
    private boolean isAtividadeAberta;
    @ManyToMany(mappedBy = "atividade")
    private List<Aluno> alunos;

    public Atividade() {
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    /**
     * @return the isAtividadeAberta
     */
    public boolean isIsAtividadeAberta() {
        return isAtividadeAberta;
    }

    /**
     * @param isAtividadeAberta the isAtividadeAberta to set
     */
    public void setIsAtividadeAberta(boolean isAtividadeAberta) {
        this.isAtividadeAberta = isAtividadeAberta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }


    
    
}
