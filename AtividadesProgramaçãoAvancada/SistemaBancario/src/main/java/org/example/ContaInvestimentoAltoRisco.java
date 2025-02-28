package org.example;

public class ContaInvestimentoAltoRisco extends  ContaInvestimento{

    private static double tarifaSaque = 0.05;
    private static double valorPermitido = 10000.00;

    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double sacar(double valor) {

        double taxa = valor * tarifaSaque;
        double valorTotal = valor + taxa;
        double saldoAtual = getSaldo() - valorTotal;

        if (saldoAtual >= valorPermitido) {
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            System.out.println("Taxa de retirada aplicada: R$ " + taxa);
            depositar(-valorTotal);
        } else {
            System.out.println("Saldo insuficiente. Saldo não pode ser abaixo de R$ " + valorPermitido + " após o saque.");
        }
        return super.sacar(valor);
    }
}
