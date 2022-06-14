package br.com.tests.tdd.model;

public enum Desempenho {
    A_DESEJAR("A desejar"),
    BOM("Bom"),
    OTIMO("Otimo");

    final String nome;

    public String getKey() {
        return this.name();
    }
    public String getNome() {
        return nome;
    }

    Desempenho(String nome) {
        this.nome = nome;
    }
}
