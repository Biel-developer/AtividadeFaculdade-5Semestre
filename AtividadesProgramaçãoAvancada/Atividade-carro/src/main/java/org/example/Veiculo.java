package org.example;

public abstract class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private int capacidadePassageiros;
    private String combustivel;

    public Veiculo(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.capacidadePassageiros = capacidadePassageiros;
        this.combustivel = combustivel;
    }

    public abstract double calcularAutonomia();

    public void exibirDetalhes(){
        System.out.println("Marca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + ano +
                "\nCapacidade de Passageiros: " + capacidadePassageiros +
                "\nTipo de Combustível: " + combustivel);
    }



}
