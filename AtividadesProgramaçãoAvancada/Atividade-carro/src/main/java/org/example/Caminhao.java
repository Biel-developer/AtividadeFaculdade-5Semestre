package org.example;

public class Caminhao extends Veiculo{

    public static final int tanque = 300;
    private int capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        int consumo = 6 - (capacidadeCarga/100);
        return tanque*consumo;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }
}