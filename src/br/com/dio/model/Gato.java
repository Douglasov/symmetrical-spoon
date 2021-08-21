package br.com.dio.model;

import java.util.Objects;

public class Gato {


    private Integer idade;
    private String cor;
    private String nome;

    public Gato() {
    }

    public Gato(Integer idade, String cor, String nome) {
        this.idade = idade;
        this.cor = cor;
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(idade, gato.idade) && Objects.equals(cor, gato.cor) && Objects.equals(nome, gato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idade, cor, nome);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "idade=" + idade +
                ", cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
