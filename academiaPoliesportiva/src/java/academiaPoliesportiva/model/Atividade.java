/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
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
    private boolean atividadeAberta = true;
    private boolean taxaMatriculaPaga;
    private boolean mensalidadePaga;
    @ManyToMany(mappedBy = "atividades")
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
     * @return the atividadeAberta
     */
 

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

  

    @Override
    public String toString() {
        return  nome  ;
    }

    public boolean isAtividadeAberta() {
        return atividadeAberta;
    }

    public void setAtividadeAberta(boolean atividadeAberta) {
        this.atividadeAberta = atividadeAberta;
    }

    public boolean isTaxaMatriculaPaga() {
        return taxaMatriculaPaga;
    }

    public void setTaxaMatriculaPaga(boolean taxaMatriculaPaga) {
        this.taxaMatriculaPaga = taxaMatriculaPaga;
    }

    public boolean isMensalidadePaga() {
        return mensalidadePaga;
    }

    public void setMensalidadePaga(boolean mensalidadePaga) {
        this.mensalidadePaga = mensalidadePaga;
    }



    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Atividade other = (Atividade) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
   
    
}