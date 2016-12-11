/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

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
    @ManyToMany( fetch = FetchType.EAGER)
    private List<Atividade> atividades;
    @OneToMany(cascade = CascadeType.REMOVE)
    private final List<Mensalidade> mensalidades;
    
    public Aluno() {
        nome = "";
        atividades = new ArrayList<>();
        mensalidades = new ArrayList<>();
    }
    public void matricula(Atividade atv) {
        this.getAtividades().add(atv);
        Mensalidade nMensa = new Mensalidade();
        nMensa.setAtividade(atv);
        nMensa.setValor(atv.getMensalidade() * 1.5);
        nMensa.setAluno(this);
        nMensa.setDataPagamento(new Date());
        nMensa.setDataVencimento(new Date());//adicionar 1 mes apos a data de pagamento
        this.getMensalidades().add(nMensa);
    }

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    List<Mensalidade> getMensalidades() {
        return this.mensalidades;
    }

    @Override
    public String toString() {
        return nome ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

  
   

    
}
