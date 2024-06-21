package com.exercicios01.demo;

import java.util.Scanner;

public class Lista03 {
    public void ex01(){

        Scanner sc = new Scanner(System.in);

        int segundos;

        while (true) {
            System.out.println("Digite um número em segundos (Entre 1 e 59): ");
            segundos = sc.nextInt();

            if (segundos >= 1 && segundos <= 59) {
                break;
                
            } else{
                System.out.println("Erro: Numero incorreto. Tente Novamente");
            }
        }

        try {
            for (int i = segundos; i > 0; i--) {
                System.out.println(i + " segundos restantes. ");
                Thread.sleep(1000);
                
            }
            System.out.println("Tempo esgotado: ");
            
        } catch (InterruptedException e) {
            System.out.println("Cronometro interrompido: ");
        
        }
        sc.close();
    }

    public void ex02(){
        Scanner tabuadinhaum = new Scanner(System.in);
        
        System.out.println("Digte um numero na tabuada: ");
        int numero = tabuadinhaum.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            
        }
        tabuadinhaum.close();


        
    }

    public void ex03(){
        Scanner meninovo = new Scanner(System.in);

        System.out.println("Digite o primeiro numero ");
        int numero1 = meninovo.nextInt();

        System.out.println("Digite o segundo numero");
        int numero2 = meninovo.nextInt();

        if (numero1 > numero2) {
            int temp = numero1;
            numero1 = numero2;
            numero2 = temp;
            
        }
        System.out.println(" Números pares entre " + numero1 + " e " + numero2 + ":");
        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                
            }
            
        }
        meninovo.close();
    }

    public void ex04(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jogador 1, escolha um número: ");
        int numero_escolhido = scanner.nextInt();

        int tentativa;
        do {
            System.out.print("Jogador 2, tente adivinhar o número: ");
            tentativa = scanner.nextInt();

            if (tentativa < numero_escolhido) {
                System.out.println("Muito baixo!");
            } else if (tentativa > numero_escolhido) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }

            if (Math.abs(tentativa - numero_escolhido) <= 2 && tentativa != numero_escolhido) {
                System.out.println("Quase lá!");
            }
        } while (tentativa != numero_escolhido);
    }

    public void ex05(){
        Scanner scanner = new Scanner(System.in);
        String loginCorreto = "luangameplays@gmail.com";
        String senhaCorreta = "123456";
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.print("Digite o login: ");
            String login = scanner.next();

            System.out.print("Digite a senha: ");
            String senha = scanner.next();

            if (login.equals(loginCorreto) && senha.equals(senhaCorreta)) {
                System.out.println("Acesso concedido!");
                return;
            } else {
                tentativas++;
                if (!login.equals(loginCorreto)) {
                    System.out.println("Login incorreto.");
                }
                if (!senha.equals(senhaCorreta)) {
                    System.out.println("Senha incorreta.");
                }
                if (tentativas == 3) {
                    System.out.println("Última tentativa, mais um erro seu acesso será bloqueado!");
                }
            }
        }

        System.out.println("Acesso bloqueado.");
    }

    public void ex06(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de andares da pirâmide: ");
        int andares = scanner.nextInt();

        for (int o = 1; o <= andares; o++) {
            for (int l = 0; l < andares - o; l++) {
                System.out.print(" ");
            }
            for (int m = 0; m < 2 * o - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
        scanner.close();
    }

    public void ex07(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");
        int largura = scanner.nextInt();
        System.out.print("Digite a altura do retângulo: ");
        int altura = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}