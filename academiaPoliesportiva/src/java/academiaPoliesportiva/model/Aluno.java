/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
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
    @ManyToMany
    private List<Atividade> atividades;
    private boolean taxaMatriculaPaga;
    private boolean mensalidadePaga;
    private boolean apto; //implementar
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
        nMensa.setValor(atv.getMensalidade() * 1.5);
        nMensa.setAluno(this);
        nMensa.setDataPagamento(new Date());
        nMensa.setDataVencimento(new Date());//adicionar 1 mes apos a data de pagamento
        this.taxaMatriculaPaga = true;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    List<Mensalidade> getMensalidades() {
        return this.mensalidades;
    }

    
}
