package org.example;


public class Produto {


    private String nome;
    private double precoUnitario;


    public Produto(String nome, double preco) {
        this.nome = nome;
        this.precoUnitario = preco;
    }


    public String getNome() {
        return nome;
    }


    public double getPrecoUnitario() {
        return precoUnitario;
    }
}