package com.exercicios01.demo;

import java.util.Scanner;

public class Lista02 {
    public void ex01(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int numero = scanner.nextInt();
        
        if (numero == 0) {
            System.out.println("O número é zero.");
        } else if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        scanner.close();
    }

    void ex02(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro número é maior.");
        } else if (numero2 > numero1) {
            System.out.println("O segundo número é maior.");
        } else {
            System.out.println("Os números são iguais.");
        }
        scanner.close();
    }

    void ex03(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Você é deficiente (sim/não)? ");
        boolean deficiente = scanner.nextBoolean();

        System.out.print("Você é gestante (sim/nao)? ");
        boolean gestante = scanner.nextBoolean();

        if (idade > 65 || deficiente || gestante) {
            System.out.println("Você deve ser encaminhado para a fila preferencial.");
        } else {
            System.out.println("Você deve ser encaminhado para a fila comum.");
        }

        scanner.close();


    }

    void ex04(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a sua idade? ");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode entrar no evento.");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Você só pode entrar no evento acompanhado pelos responsáveis.");
        } else {
            System.out.println("Você pode entrar no evento.");
        }

        scanner.close();
    }

    void ex05(){
        String login_correto = "usuario";
        String senha_correta = "senha123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o login: ");
        String login = scanner.next();
        System.out.print("Digite a senha: ");
        String senha = scanner.next();

        if (!login.equals(login_correto) && !senha.equals(senha_correta)) {
            System.out.println("Login e senha incorretos.");
        } else if (!login.equals(login_correto)) {
            System.out.println("Login incorreto.");
        } else if (!senha.equals(senha_correta)) {
            System.out.println("Senha incorreta.");
        } else {
            System.out.println("Login e senha corretos.");
        }

        scanner.close();

    }

    void ex06(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();
        double notaRecuperacao = 0;

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            System.out.println("Aluno em recuperação. Média atual: " + media);
        }


            if (media < 6) {
                System.out.print("Digite a nota da prova de recuperação: ");
                notaRecuperacao = scanner.nextDouble();
                nota1 = notaRecuperacao;
                if (nota1 > 6) {
                    System.out.println("aprovado");
                    
                }
            } else { 
                System.out.println("Aluno reprovado com média: " + media);
            }
            

           
            scanner.close();
    }

    void ex07(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();
        System.out.println("Digite o valor de X: ");
        int x = scanner.nextInt();

        if (numero % x == 0) {
           System.out.println("O número " + numero + " é divisível por " + x);
        } else{
            System.out.println("O número " + numero + " não é divisível por " + x);
        }
        scanner.close();
    }

    void ex08(){
        Scanner scanner = new Scanner(System.in);
        int erros = 0;
        int acertos = 0;

        
        String[][] perguntas = {
            {"Quantos Arcos Berserk tem?", "a) 5", "b) 3", "c) 8", "d) 3", "a"},
            {"O que Vinland Saga nos ensina?", "a) aprender a ser violento", "b) ser solitario", "c) Você não tem inimigos", "d) ser uma pessoa gananciosa", "c"},
            {"Quem foi Thorfinn na vida real?", "a) cozinheiro", "b) viking", "c) explorador", "d) ladrão", "c"},
            {"Quem foi Miyamoto Musashi na vida real?", "a) fuzileiro", "b) politico", "c) samurai", "d) ninja", "c"},
            {"O que significa samurai na Bíblia?", "a) aquele que fico so", "b) aquele que serve ao senhor", "c) aquele que esta triste", "d) aquele que morre lutando", "b"}
        };

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(perguntas[i][j]);
            }

            System.out.print("Digite a sua resposta: ");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase(perguntas[i][5])) {
                acertos++;
                System.out.println("Resposta correta!\n");
            } else {
                erros++;
                System.out.println("Resposta incorreta.\n");
                if (erros == 3) {
                    System.out.println("Você errou 3 vezes. Fim de jogo.");
                    break;
                }
            }
        }

        if (erros < 3) {
            System.out.println("Parabéns! Você completou o jogo.");
        }

        System.out.println("Número de acertos: " + acertos);
        scanner.close();
    }
}
