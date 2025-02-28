package org.example;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1234, "João Silva", 1000);
        System.out.println("\n=====================================");
        System.out.println("         Conta Corrente");
        System.out.println("=====================================");

        contaCorrente.exibirInformacoes();
        contaCorrente.sacar(1100);
        contaCorrente.sacar(200);

        ContaInvestimento contaInvestimento = new ContaInvestimento(5678, "Maria Oliveira", 2000);
        System.out.println("\n=====================================");
        System.out.println("        Conta Investimento");
        System.out.println("=====================================");

        contaInvestimento.exibirInformacoes();
        contaInvestimento.sacar(500);

        ContaInvestimentoAltoRisco contaInvestiemntoAltoRisco = new ContaInvestimentoAltoRisco(9101, "Carlos Souza", 50000);
        System.out.println("\n=====================================");
        System.out.println("   Conta Investimento Alto Risco      ");
        System.out.println("=====================================");

        contaInvestiemntoAltoRisco.exibirInformacoes();
        contaInvestiemntoAltoRisco.sacar(20000);
        contaInvestiemntoAltoRisco.sacar(40000);

        ContaPoupanca contaPoupanca = new ContaPoupanca(1122, "Ana Costa", 1500);
        System.out.println("\n=====================================");
        System.out.println("        ContaPoupanca");
        System.out.println("=====================================");

        contaPoupanca.exibirInformacoes();
        contaPoupanca.sacar(2000);
        contaPoupanca.sacar(1000);

        ContaSalario contaSalario = new ContaSalario(3344, "Rodrigo fernando", 800,0);
        System.out.println("\n=====================================");
        System.out.println("        Conta Salario");
        System.out.println("=====================================");

        contaSalario.exibirInformacoes();
        contaSalario.sacar(100);
        contaSalario.sacar(100);
    }
}