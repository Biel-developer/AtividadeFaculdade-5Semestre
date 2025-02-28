package org.example;

public class ContaCorrente extends ContaBancaria{

    private final double chequeEspecial = 200;

    public ContaCorrente(int numeroConta, String titular, float saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public double sacar(double valor) {
        double saque, saldo = getSaldo();

        if (getSaldo() < valor){
            if (getSaldo() + chequeEspecial == valor){
                saque = getSaldo() + chequeEspecial;
                System.out.println("Sacando: " + saque);
                System.out.println("Saldo atual: " + getSaldo());
                return saque;
            } else {
                System.out.println("\nValor para saque indisponivel!");
                System.out.println("\nSaldo atual: " + getSaldo()+ "Valor de Cheque Especial: " + chequeEspecial);
            }
        }
        saldo -= valor;
        System.out.println("\nSaque realizado com sucesso!");
        System.out.println("Saldo atual: " + getSaldo());
        return saldo;
    }
}
