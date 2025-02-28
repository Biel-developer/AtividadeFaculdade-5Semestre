package org.example;

public class CarroEletrico extends Carro{

    public static final int bateriaKWh = 90;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, tipoCarro);
    }

    @Override
    public double calcularAutonomia() {
        //consumo de 5km/kWh
        return bateriaKWh*5;
    }
}
