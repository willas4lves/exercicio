package com.exercicios01.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista04 {

    public void ex01(){
        double[] vendas = {100.50, 200.75, 50.25, 80.00, 120.00};
        double fechamento = 0;

        for (double venda : vendas) {
            fechamento += venda;
        }

        System.out.printf("Fechamento do dia: R$%.2f%n", fechamento);

    }

    public void ex02(){

        double vendas[] = { 20.50, 100.50, 15.50, 10.50 };
        double menorVenda = vendas[0];
        double maiorVenda = vendas[0];

        for (double i : vendas) {
            if (i < menorVenda) {
                menorVenda = i;
            }
        }

        for (double x : vendas) {
            if (x > maiorVenda) {
                maiorVenda = x;
            }
        }

        System.out.println("A menor venda foi: " + menorVenda);
        System.out.println("e a maior venda foi: " + maiorVenda);
    }

    public void ex03(){

        double vendas[] = { 20.50, 100.50, 15.50, 10.50 };
        double fechamento = 0;
        double ticketMedio;

        for (double i : vendas) {
            fechamento += i;
        }

        ticketMedio = fechamento / vendas.length;

        System.out.println("a media foi : " + ticketMedio);

    }
    public void ex04(){
        int[] lista = {3, 5, 6, 7, 8, 10, 22, 55, 110};
        int countPares = 0;

        for(int num : lista){
            if (num % 2 == 0) {
                countPares++;
                
            }
        }

        System.out.println("Quantidade de números pares: " + countPares);
    }

    public void ex05(){
        ArrayList<String> lista_de_compras = new ArrayList<>();
        Scanner mercadiunho = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Digite '1' para inserir um item, '2' para ver a lista, ou '3' para sair:");
            opcao = mercadiunho.nextLine();
            switch (opcao) {
                case "1":
                    System.out.println("Digite o nome do item:");
                    String item = mercadiunho.nextLine();
                    lista_de_compras.add(item);
                    break;
                case "2":
                    System.out.println("Lista de Compras:");
                    for (String i : lista_de_compras) {
                        System.out.println(i);
                    }
                    break;
                case "3":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            
        } while (!opcao.equals("3"));
    }

    public void ex06(){
        ArrayList<String> listaDeCompras = new ArrayList<>();
        Scanner mercadium = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Digite '1' para inserir um item, '2' para ver a lista, '3' para remover um item, ou '4' para sair:");
            opcao = mercadium.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Digite o nome do item:");
                    String item = mercadium.nextLine();
                    listaDeCompras.add(item);
                    break;
                case "2":
                    System.out.println("Lista de Compras:");
                    for (String i : listaDeCompras) {
                        System.out.println(i);
                    }
                    break;
                case "3":
                    System.out.println("Digite o nome da mercadoria a remover:");
                    String itemRemover = mercadium.nextLine();
                    listaDeCompras.remove(itemRemover);
                    break;
                case "4":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (!opcao.equals("4"));
        mercadium.close();
    }

    public void ex07(){
        
        ArrayList<String> listaDeCompras = new ArrayList<>();
        ArrayList<Double> listaDePrecos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("Digite '1' para inserir um item, '2' para ver a lista, '3' para remover um item, ou '4' para sair:");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Digite o nome do item:");
                    String item = scanner.nextLine();
                    listaDeCompras.add(item);
                    System.out.println("Digite o preço do item:");
                    double preco = scanner.nextDouble();
                    scanner.nextLine();
                    listaDePrecos.add(preco);
                    break;
                case "2":
                    System.out.println("Lista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println(listaDeCompras.get(i) + " - R$" + listaDePrecos.get(i));
                    }
                    break;
                case "3":
                    System.out.println("Digite o nome do item a remover:");
                    String itemRemover = scanner.nextLine();
                    int index = listaDeCompras.indexOf(itemRemover);
                    if (index >= 0) {
                        listaDeCompras.remove(index);
                        listaDePrecos.remove(index);
                    } else {
                        System.out.println("Item não encontrado.");
                    }
                    break;
                case "4":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (!opcao.equals("4"));
    }

    public void ex08(){
        ArrayList<String> listaDeCompras = new ArrayList<>();
        ArrayList<Double> listaDePrecos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String opcao;

        listaDeCompras.add("Arroz");
        listaDePrecos.add(20.50);
        listaDeCompras.add("Feijão");
        listaDePrecos.add(10.75);
        listaDeCompras.add("Carne");
        listaDePrecos.add(50.25);
        listaDeCompras.add("Leite");
        listaDePrecos.add(5.80);

    do {
        System.out.println("Digite '1' para inserir um item, '2' para ver a lista, '3' para remover um item, '4' para ver a lista ordenada por preço, ou '5' para sair:");
        opcao = scanner.nextLine();

        switch (opcao) {
            case "1":
                System.out.println("Digite o nome do item:");
                String item = scanner.nextLine();
                listaDeCompras.add(item);
                System.out.println("Digite o preço do item:");
                double preco = scanner.nextDouble();
                scanner.nextLine();
                listaDePrecos.add(preco);
                break;
            case "2":
                System.out.println("Lista de Compras:");
                for (int i = 0; i < listaDeCompras.size(); i++) {
                System.out.println(listaDeCompras.get(i) + " - R$" + listaDePrecos.get(i));
                }
                break;
            case "3":
                System.out.println("Digite o nome do item a remover:");
                String itemRemover = scanner.nextLine();
                int index = listaDeCompras.indexOf(itemRemover);
                if (index >= 0) {
                listaDeCompras.remove(index);
                listaDePrecos.remove(index);
                } else {
                System.out.println("Item não encontrado.");
                }
                break;
            case "4":
                ArrayList<Integer> indices = new ArrayList<>();
                for (int i = 0; i < listaDePrecos.size(); i++) {
                indices.add(i);
                }
                indices.sort((i1, i2) -> Double.compare(listaDePrecos.get(i1), listaDePrecos.get(i2)));
                System.out.println("Lista de Compras (ordenada por preço):");
                for (int i : indices) {
                    System.out.println(listaDeCompras.get(i) + " - R$" + listaDePrecos.get(i));
                }
                break;
            case "5":
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
        }
        } while (!opcao.equals("5"));
    }
}
