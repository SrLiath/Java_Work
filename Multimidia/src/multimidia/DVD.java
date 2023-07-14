/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multimidia;

/**
 *
 * @author VF_CASA
 */
public class DVD {
    private String titulo;
    private String diretor;
    private int tempoDuracao;
    private boolean tenho;
    private String descricao;

    public DVD(String titulo, String diretor, int tempoDuracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.tempoDuracao = tempoDuracao;
        this.tenho = false;
        this.descricao = descricao;
    }

    public void setTenho(boolean tenho) {
        this.tenho = tenho;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public boolean getTenho() {
        return tenho;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
    
}
