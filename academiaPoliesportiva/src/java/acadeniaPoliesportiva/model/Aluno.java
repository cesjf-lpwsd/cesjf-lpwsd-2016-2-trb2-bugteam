/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acadeniaPoliesportiva.model;

import java.util.List;

/**
 *
 * @author aluno
 */
public class Aluno {
    private String nome;
    private List<Atividade> atividade;
    private boolean isTaxaMatriculaPaga;
    private boolean isMensalidadePaga;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Atividade> getAtividade() {
        return atividade;
    }

    public void setAtividade(List<Atividade> atividade) {
        this.atividade = atividade;
    }

    public boolean isIsTaxaMatriculaPaga() {
        return isTaxaMatriculaPaga;
    }

    public void setIsTaxaMatriculaPaga(boolean isTaxaMatriculaPaga) {
        this.isTaxaMatriculaPaga = isTaxaMatriculaPaga;
    }

    public boolean isIsMensalidadePaga() {
        return isMensalidadePaga;
    }

    public void setIsMensalidadePaga(boolean isMensalidadePaga) {
        this.isMensalidadePaga = isMensalidadePaga;
    }
     
    
}
