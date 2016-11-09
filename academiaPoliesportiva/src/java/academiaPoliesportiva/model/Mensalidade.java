/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.model;

import java.io.Serializable;
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
    @OneToOne
    private Aluno aluno;
    @ManyToOne
    private Atividade atividade;
    private float manutencao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataVencimento;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataPagamento;
    private boolean isFormaPagamento;
    private double valor;

    public Mensalidade() {
    }      
    public Mensalidade(Aluno a, Atividade b) {
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
        // = atividade.getMensalidade() / 5
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
    public boolean isIsFormaPagamento() {
        return isFormaPagamento;
    }

    /**
     * @param isFormaPagamento the FormaPagamento to set
     */
    public void setIsFormaPagamento(boolean isFormaPagamento) {
        this.isFormaPagamento = isFormaPagamento;
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
    public boolean isPaga(){
        return this.dataPagamento!=null;
    }

}
