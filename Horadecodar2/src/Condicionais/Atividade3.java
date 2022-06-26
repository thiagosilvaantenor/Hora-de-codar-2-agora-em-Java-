package Condicionais;

import java.util.Scanner;

public class Atividade3 {
    //3. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
    public static void main(String[] args) {
        double n1,n2,n3;
        Scanner in = new Scanner(System.in);
        System.out.println("Ola, por favor, informe um numero: ");
        n1 = in.nextDouble();
        System.out.println("Agora, informe um segundo numero: ");
        n2 = in.nextDouble();
        System.out.println("Agora, informe um terceiro numero: ");
        n3 = in.nextDouble();


        if (n1 > n2 && n1 > n3){
            System.out.println("Dentre os numeros informados, o maior e:" + n1);
        }
        else if ( n2 > n1 && n2 > n3){
            System.out.println("Dentre os numeros informados, o maior e:" + n2);
        }else if (n3 > n1 && n3 > n2){
            System.out.println("Dentre os numeros informados, o maior e:" + n3);
        }

    }
}
