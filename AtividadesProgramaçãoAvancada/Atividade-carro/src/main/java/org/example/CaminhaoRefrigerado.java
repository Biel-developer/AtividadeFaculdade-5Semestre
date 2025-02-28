package org.example;

public class CaminhaoRefrigerado extends Caminhao{

    public static final float temperaturaMinima = 21.5F;

    public CaminhaoRefrigerado(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, capacidadeCarga);
    }

    @Override
    public double calcularAutonomia() {
        double consumo = super.calcularAutonomia();
        return (consumo - 0.6);
    }


}
