package com.exercicios01.demo;

import java.util.Scanner;

public class Lista03 {
     void ex01(){

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
        
    }

}