/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multimidia;

/**
 *
 * author VF_CASA
 */
public class CD {
    private String titulo;
    private String artista;
    private int numeroDeFaixa;
    private String tempoDuracao;
    private boolean tenho;
    private String descricao;

    public CD(String titulo, String artista, int numeroDeFaixa, String tempoDuracao, boolean tenho) {
        this.titulo = titulo;
        this.artista = artista;
        this.numeroDeFaixa = numeroDeFaixa;
        this.tempoDuracao = tempoDuracao;
        this.tenho = tenho;
        this.descricao = "";
    }

    public void setTenho(boolean tenho) {
        this.tenho = tenho;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setNumeroDeFaixa(int numeroDeFaixa) {
        this.numeroDeFaixa = numeroDeFaixa;
    }

    public void setTempoDuracao(String tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean getTenho() {
        return tenho;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getArtista() {
        return artista;
    }

    public int getNumeroDeFaixa() {
        return numeroDeFaixa;
    }

    public String getTempoDuracao() {
        return tempoDuracao;
    }

}
