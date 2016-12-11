/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academiaPoliesportiva.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
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
    
    @OneToOne
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
        this.manutencao = (float) (getValor() *0.2);
        return manutencao;
    }

    public void setManutencao(float manutencao) {
        this.manutencao = manutencao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        Date d =new Date();
           Calendar c = Calendar.getInstance();
                  c.setTime(d);
                  c.set(Calendar.MONTH, c.get(Calendar.MONTH) + 1);
        

        
        this.dataVencimento = c.getTime();
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
      
        this.dataPagamento = new Date();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final Mensalidade other = (Mensalidade) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
