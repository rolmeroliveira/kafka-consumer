package com.zup.kafka;

public class Teste {
    private String id;
    private String nome;

    public Teste(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Teste() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Teste{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
