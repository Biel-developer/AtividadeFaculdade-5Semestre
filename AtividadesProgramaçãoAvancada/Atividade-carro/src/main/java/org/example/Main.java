package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x;

        // Criando os veículos
        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Gasolina", "Sedan");
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 2024, 5, "--", "Sedan");
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2021, 2, "Diesel", 38);
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "P360", 2023, 2, "Diesel", 38);
        Onibus onibus = new Onibus("Volvo", "B12M", 2022, 60, "Diesel", 6);

        do {
            System.out.println("Por favor digite o número do veículo para mais detalhes!");
            System.out.println("1. Toyota Corolla");
            System.out.println("2. Tesla Model S");
            System.out.println("3. Volvo FH");
            System.out.println("4. Scania P360");
            System.out.println("5. Mercedes-Benz O500");
            System.out.println("6. Volvo B12M");
            System.out.println("0. Sair");
            x = ler.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Detalhes do Carro:");
                    carro.exibirDetalhes();
                    System.out.println("Capacidade do Tanque: " + Carro.tanque + " litros");
                    System.out.println("Tipo do Carro: " + carro.getTipoCarro());
                    carro.exibirDetalhes();
                    System.out.println("Autonomia: " + carro.calcularAutonomia() + " km");
                    break;
                case 2:
                    System.out.println("Detalhes do Carro Elétrico:");
                    System.out.println("Capacidade da Bateria: " + CarroEletrico.bateriaKWh + " kWh");
                    System.out.println("Tipo do Carro: " + carro.getTipoCarro());
                    carroEletrico.exibirDetalhes();
                    System.out.println("Autonomia: " + carroEletrico.calcularAutonomia() + " km");
                    break;
                case 3:
                    System.out.println("Detalhes do Caminhão:");
                    System.out.println("Capacidade do Tanque: " + Caminhao.tanque + " litros");
                    System.out.println("Capacidade de Carga: " + caminhao.getCapacidadeCarga() + " toneladas");
                    caminhao.exibirDetalhes();
                    System.out.println("Autonomia: " + caminhao.calcularAutonomia() + " km");
                    break;
                case 4:
                    System.out.println("Detalhes do Caminhão Refrigerado:");
                    System.out.println("Capacidade do Tanque: " + CaminhaoRefrigerado.tanque + " litros");
                    System.out.println("Temperatura Miníma: " + CaminhaoRefrigerado.temperaturaMinima + " Graus");
                    System.out.println("Capacidade de Carga: " + caminhaoRefrigerado.getCapacidadeCarga() + " toneladas");
                    caminhaoRefrigerado.exibirDetalhes();
                    System.out.println("Autonomia: " + caminhaoRefrigerado.calcularAutonomia() + " km");
                    break;
                case 5:
                    System.out.println("Mercedes-Benz O500 não implementado.");
                    break;
                case 6:
                    System.out.println("Detalhes do Ônibus:");
                    System.out.println("Capacidade do Tanque: " + Onibus.tanque + " litros");
                    System.out.println("Quantidade de Eixos: " + onibus.getQuantidadeEixos());
                    onibus.exibirDetalhes();
                    System.out.println("Autonomia: " + onibus.calcularAutonomia() + " km");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (x != 0);

        ler.close();
    }
}