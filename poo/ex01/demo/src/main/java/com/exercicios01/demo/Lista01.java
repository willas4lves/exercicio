package com.exercicios01.demo;

import java.util.Scanner;

public class Lista01 {
    public void ex01(){
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int soma;


        System.out.println("Digite um numero: ");

        num1 = sc.nextInt();

        System.out.println("Digite um numero: ");

        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.println("Resultado: " + soma);
        
        sc.close();

    }

    public void ex02(){
        String nome;
        String sobrenome;
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        nome = Scanner.nextLine();
        System.out.println("Digite seu sobrenome");
        sobrenome = Scanner.nextLine();



        System.out.println("Olá " + nome  + sobrenome + "!");
        Scanner.close();
    }

    public void ex03(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("\"Digite o valor em reais: \"");
        double valorReais = Scanner.nextDouble();
        double valorconvertido = 5.25;

        double valorDolares = valorReais / valorconvertido;

        System.out.printf("O valor em dólares é: $%.2f%n", valorDolares);

        Scanner.close();
    }

    public void ex04(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = Scanner.nextInt();
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        System.out.println("O antecessor de " + numero + " é " + antecessor + " e o sucessor é " + sucessor + ".");

        Scanner.close();
    }

    public void ex05(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite a largura do terreno em metros: ");
        double largura = Scanner.nextDouble();
        System.out.println("Digite o comprimento do terreno em metros: ");
        double comprimento = Scanner.nextDouble();
        System.out.println("Digite o valor do terreno por metro quadrado: ");
        double metrospor2 = Scanner.nextDouble();
        double area = largura * comprimento;
        double Total = area * metrospor2;
        System.out.printf("A área do terreno é m² " + area +"o valor total é R$" + Total);

        Scanner.close();
    }

    public void ex06(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite a distância percorrida em km: ");
        double distância_percorrida = Scanner.nextDouble();
        System.out.println("Digite o total de combustível gasto em litros: ");
        double combustívelgasto = Scanner.nextDouble();

        double consumo_medio = distância_percorrida / combustívelgasto;
        System.out.printf("O consumo médio do veículo é "+ consumo_medio + "km/h");


        Scanner.close();
    }

    public void ex07(){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = Scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = Scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = Scanner.nextDouble();
        System.out.println("Digite a quarta nota: ");
        double nota4 = Scanner.nextDouble();

        double nota_media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("Sua media é " + nota_media);
        Scanner.close();
    }
    
    public void ex08(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) / 1.8;

        System.out.printf("A temperatura em Celsius é: %.2f%n", celsius);

        scanner.close();
    }
}
