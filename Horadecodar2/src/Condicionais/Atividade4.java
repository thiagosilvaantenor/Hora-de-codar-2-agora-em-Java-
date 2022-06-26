package Condicionais;

import java.util.Scanner;

public class Atividade4 {
    //4. Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
    public static void main(String[] args) {
        double n1,n2,n3;
        double soma1,soma2,soma3,soma4,soma5,soma6;
        System.out.println("Ola, por favor, informe um numero: ");
        Scanner in = new Scanner(System.in);
        n1 = in.nextDouble();
        System.out.println("Informe, mais um numero: ");
        n2 = in.nextDouble();
        System.out.println("Informe, mais um numero: ");
        n3 = in.nextDouble();

        if (n1 > n3 && n2 > n3){
            soma1 = n1 + n2;
            System.out.println("A soma dos dois numeros maiores, " + soma1);
        }
        else if (n2 > n3 && n1 > n3){
            soma2 = n2 + n1;
            System.out.println("A soma dos dois numeros maiores, " + soma2);
        }
        else if (n1 > n2 && n3 > n2){
            soma3 = n1 + n3;
            System.out.println("A soma dos dois numeros maiores, " + soma3);
        }
        else if (n3 > n2 && n1 > n2){
            soma4 = n3 + n1;
            System.out.println("A soma dos dois numeros maiores, " + soma4);
        }
        else if (n2 > n1 && n3 > n1){
            soma5 = n2 + n3;
            System.out.println("A soma dos dois numeros maiores, " + soma5);
        }
        else if (n3 > n1 && n2 > n1){
            soma6 = n3 + n2;
            System.out.println("A soma dos dois numeros maiores, " + soma6);
        }
    }
}
