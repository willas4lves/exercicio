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

    }

}
