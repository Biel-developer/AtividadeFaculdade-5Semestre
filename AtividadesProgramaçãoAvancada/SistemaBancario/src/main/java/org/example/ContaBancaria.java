package org.example;

public abstract class ContaBancaria {

    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double depositar(double valor){
        return 0;
    }

    public double sacar(double valor) {
        return 0;
    }

    public void exibirInformacoes() {
        System.out.println("\n----- Informações da Conta -----");
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
}
