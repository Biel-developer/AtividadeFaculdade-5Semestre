package org.example;

public class ContaInvestimento extends ContaBancaria{

    public ContaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double sacar(double valor) {
        double saque;

        saque = getSaldo() - (valor - 0.02);
        return 0;
    }
}
