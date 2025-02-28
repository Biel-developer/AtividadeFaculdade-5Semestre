package org.example;

public class Onibus extends Veiculo{

    public static final int tanque = 200;
    private int quantidadeEixos;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.quantidadeEixos = quantidadeEixos;
        if (quantidadeEixos < 6 || quantidadeEixos > 8) {
            throw new IllegalArgumentException("O numero de eixos deve ser entre 6 e 8 eixos.");
        }
    }

    @Override
    public double calcularAutonomia() {
        return tanque*5;
    }


    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }
}
