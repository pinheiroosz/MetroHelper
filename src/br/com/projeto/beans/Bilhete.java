package br.com.projeto.beans;

public class Bilhete {
    private int numeroDoBilhete;
    private String tipoDeBilhete; // e.g., "único", "diário", "semanal"
    private double preco;

    public Bilhete(int numeroDoBilhete, String tipoDeBilhete, double preco) {
        this.numeroDoBilhete = numeroDoBilhete;
        this.tipoDeBilhete = tipoDeBilhete;
        this.preco = preco;
    }

    // Getters e Setters
    public int getNumeroDoBilhete() {
        return numeroDoBilhete;
    }

    public String getTipoDeBilhete() {
        return tipoDeBilhete;
    }

    public double getPreco() {
        return preco;
    }
}

