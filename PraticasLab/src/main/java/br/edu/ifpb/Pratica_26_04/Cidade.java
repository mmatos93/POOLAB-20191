package br.edu.ifpb.Pratica_26_04;

import java.util.Objects;

public class Cidade {
    private String nome;
    private String estado;
    private int cod_postal;

    public Cidade(String nome, String estado, int cod_postal) {
        this.nome = nome;
        this.estado = estado;
        this.cod_postal = cod_postal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(int cod_postal) {
        this.cod_postal = cod_postal;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", estado='" + estado + '\'' +
                ", cod_postal=" + cod_postal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return cod_postal == cidade.cod_postal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod_postal);
    }
}
