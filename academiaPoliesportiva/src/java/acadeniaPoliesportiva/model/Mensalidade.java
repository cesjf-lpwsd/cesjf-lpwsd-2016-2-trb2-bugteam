/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acadeniaPoliesportiva.model;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Mensalidade {

    private Aluno aluno;
    private Atividade atividade;
    private float manutencao = atividade.getMensalidade() / 5;
    private Date dataVencimento;
    private boolean isFormaPagamento;
            
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

}
