package org.example;

public class Carro extends Veiculo{

    public static final int tanque = 50;
    private String tipoCarro;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.tipoCarro = tipoCarro;
    }

    @Override
    public double calcularAutonomia() {
        return tanque*12;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }
}
