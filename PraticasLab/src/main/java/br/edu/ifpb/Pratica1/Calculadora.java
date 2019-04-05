package br.edu.ifpb.Pratica1;

public class Calculadora {

    private String descricao;
    private double memoria;

    public Calculadora() {
        this.descricao = "Esta é uma calculadora padrão!";
        this.memoria = 0.0;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public double soma(double n1, double n2){
        return (n1+n2);
    }

    public double subtrai(double n1, double n2){
        return (n1-n2);
    }

    public double multiplica(double n1, double n2){
        return (n1*n2);
    }

    public double divide(double n1, double n2){
        return (n1/n2);
    }


}
