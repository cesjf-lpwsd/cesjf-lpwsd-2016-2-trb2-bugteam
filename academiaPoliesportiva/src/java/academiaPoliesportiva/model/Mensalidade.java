/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author aluno
 */
@Entity
public class Mensalidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private Aluno aluno;
    
    private Atividade atividade;
    private float manutencao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataVencimento;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataPagamento;
    private boolean formaPagamento;
    private double valor;
  
    
    public Mensalidade() {
    }

    public Mensalidade(Aluno a, Atividade b) {// criar mensalidade
        this.aluno = a;
        this.atividade = b;
    }
     void paga(Aluno a) {
        this.setDataPagamento(new Date());


    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public float getManutencao() {
        this.manutencao = atividade.getMensalidade() / 5;
        return manutencao;
    }

    public void setManutencao(float manutencao) {
        this.manutencao = manutencao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    /**
     * @return the FormaPagamento
     */
    public boolean isFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the FormaPagamento to set
     */
    public void setFormaPagamento(boolean formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setValor(double d) {
        this.valor = d;
    }

    public double getValor() {
        return this.valor;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

}
