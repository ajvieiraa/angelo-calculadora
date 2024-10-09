package com.example.demo;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double Valor1;
        Double Valor2;
        String operacao;
        Boolean continuar;

        do {
            System.out.println("Digite o valor 1: ");
            Valor1 = scanner.nextDouble();

            System.out.println("Digite a operação (+, -, /, x, fatoração)");
            operacao = scanner.next();

            System.out.println("Digite o valor 2: ");
            Valor2 = scanner.nextDouble();

            System.out.println(" Resultado: " + realizarCalculo(Valor1, Valor2, operacao));
            continuar = verificarNovaOperação();
        } while (continuar);

    }
    public static boolean verificarNovaOperação(){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operação ? (S/N): ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }




    public static Double realizarCalculo(Double Valor1, Double Valor2, String operacao) {

        Double respostaCalculo = 0.0;

        switch (operacao) {
            case "+":
                respostaCalculo = Valor1 + Valor2;
                break;

            case "-":
                respostaCalculo = Valor1 - Valor2;
                break;
            case "x":
                respostaCalculo = Valor1 * Valor2;
                break;
            case "/":
                respostaCalculo = Valor1 / Valor2;
                break;

            default:
                System.out.println("  Operação é inválida =(  ");
        }
        return respostaCalculo;
    }
}
