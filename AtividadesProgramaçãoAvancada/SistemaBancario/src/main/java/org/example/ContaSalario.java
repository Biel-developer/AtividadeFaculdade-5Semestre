package org.example;

public class ContaSalario extends ContaCorrente {

    private int saqueMensal;
    private static final double taxa = 5.00;


    public ContaSalario(int numeroConta, String titular, float saldo, int i) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double sacar(double valor) {

        double valorTotal;

        if (saqueMensal == 0) {
            valorTotal = valor;
        } else {
            valorTotal = valor + taxa;
        }

        if (getSaldo() >= valorTotal) {
            double saldo = valorTotal;
            saqueMensal++;
            System.out.println("Saque realizado: R$ " + valor);
            if (valorTotal > valor) {
                System.out.println("Taxa de saque aplicada: R$ " + taxa);
            }
            System.out.println("Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
        return super.sacar(valor);
    }
}
