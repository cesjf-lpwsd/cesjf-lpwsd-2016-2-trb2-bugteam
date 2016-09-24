/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acadeniaPoliesportiva.model;

/**
 *
 * @author aluno
 */
class Atividade {
    private String nome;
    private float mensalidade;
    private boolean isAtividadeAberta;

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
    
    
}
