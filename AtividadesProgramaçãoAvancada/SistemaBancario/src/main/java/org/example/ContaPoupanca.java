package org.example;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double sacar(double valor) {
        if(valor > getSaldo());
              System.out.println("Saldo insuficiente para o saque");

        return getSaldo();
    }
}
