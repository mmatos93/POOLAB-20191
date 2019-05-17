package br.edu.ifpb.Pratica5;

import java.util.ArrayList;

public class ContaCorrente {

    ArrayList<String> registro;
    private int numero;
    private String titular;
    private double saldo;

    public ContaCorrente(int numero, String nome, double saldo) {
        setNumero(numero);
        setTitular(nome);
        setSaldo(saldo);
        registro = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero >= 0) {
            this.numero = numero;
        }

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if(titular != null && titular.length() > 0){
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double calculaCPMF(double valor){
        return 0.01*valor;
    }

    public void descontaCPMF(double valor){
        double cpmf = calculaCPMF(valor);
        saldo -= cpmf;
    }

    public boolean sacar(double valor){

        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            descontaCPMF(valor);
            registro.add("Saque: " + valor);
            return true;
        }
        else return false;
    }

    public boolean depositar(double valor){
        if(valor > 0){
            saldo += valor;
            registro.add("Deposito: " + valor);
            return true;
        }
        else return false;
    }
}
