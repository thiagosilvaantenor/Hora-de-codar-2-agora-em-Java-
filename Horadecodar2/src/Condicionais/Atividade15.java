package Condicionais;

import java.util.Scanner;

public class Atividade15 {
    //15 - Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

    public static void main (String[] args){
        int ano;
        Scanner in = new Scanner(System.in);

        //valor1
        System.out.println("Ola, esse programa ira dizer se voce pode votar, ou, nao em 2022, por favor, informe o ano de seu nascimento:");
        ano = in.nextInt();

        //Aprovado
        if (ano <= 2006) {
            System.out.println("Voce ja pode votar em 2022");
        }
        //Reprovado
        else {
            System.out.println("Infelizmente você ainda não pode votar em 2022");
        }

    }
}

