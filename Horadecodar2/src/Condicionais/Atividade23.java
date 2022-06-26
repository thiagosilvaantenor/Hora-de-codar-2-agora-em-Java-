package Condicionais;

import java.util.Scanner;

public class Atividade23 {
    // 23 - Faça um programa em que o usuário informe 20 valores e no final, escreva o maior e o menor valor lido.

    public static void main(String [] args){
        Scanner valor = new Scanner(System.in);
        int count = 1;
        int maior = 0;
        int menor = 0;

        while (count <= 20){
            System.out.println("Por favor, informe um valor " + count + ": ");
            int numb = valor.nextInt();

            if ( numb > maior){
            maior = numb;
            }
            else if( numb < menor){
                menor = numb;
            }
            count++;
        }
        System.out.println("O maior numero informado é: " + maior);
        System.out.println("O menor numero informado é: " + menor);
    }

}
