package Repeticao;

import java.util.Scanner;

public class Atividade2 {
    //2. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int count = 1;
        int maior = 0;
        System.out.println("Ola, esse programa irá dizer se o numero informado é positivo, negativo ou zero.");
        while (count <= 3){

            System.out.println("Por favor, informe um numero");
            int n1 = in.nextInt();

            if (n1 > maior){
                maior = n1;
            }
            else if (n1 == maior){
                System.out.println("OPA! Por favor, informe um valor diferente!");
                count--;
            }
            count++;
        }
        System.out.println("O MAIOR VALOR INFORMADO É ... " + maior);
    }
}
