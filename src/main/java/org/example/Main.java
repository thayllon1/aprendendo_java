package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //local de declaração de variáveis
          Scanner scanner = new Scanner(System.in);
        int menu = 0;


        System.out.println("---------------------------------------------");
        System.out.println("|            programa de reolução               |");
        System.out.println("|                      de càlculos              |");
        System.out.println("---------------------------------------------");
        System.out.println();
        System.out.println("bem vindo ao progama e resolução de cálculos");
        System.out.println("escolha a opção desejada:");
        System.out.println("1 - conversor de moedas");
        System.out.println("conversor de medidas");
        System.out.println("de temperatura");
        System.out.print("opção: ");
        menu = scanner.nextInt();


        //Execução do menu no nivel correto

        switch(menu) {
            case 1:
                System.out.println("Entrou no conversão de moeda");
                break;
            case 2:
                System.out.println("entrou no conversão de medid");
                break;
            case 3:
                System.out.println("entrou no conversão de temperatura");
                break;
            default:
                System.out.print("Opção Inválida");
                break;
        }












//Execução do menu no nivel complicado
        //if (menu == 1) {
            //verifica se digitou o valor 1 para o menu
          //  System.out.println("entrou no converso na moeda");

       // } else {
           // if (menu == 2) {
                // se digitou o valor 2 para o menu
                //System.out.println("Entrou no conversor de medidas");
            //} else {
                //se não digitou o valor 2, executa isso
               // if (menu == 3) {

              //  } else {
                    //se nao digitou o valor 3, executa isso
//System.out.println("Opção inválida");

                //}

           // }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  

       // }

    }


}