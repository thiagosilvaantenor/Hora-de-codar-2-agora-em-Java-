package Condicionais;

import java.util.Scanner;

public class Atividade1 {
    // 1. Escreva um programa em que o usuário informe dois números utilizando o "prompt". Então escreva em tela o maior deles.
    public static void main(String [] args) {
        int n1, n2;

        Scanner in = new Scanner(System.in);
        System.out.println("Ola, por favor, informe um numero: ");
        n1 = in.nextInt();
        System.out.println("Agora, por favor, informe outro numero: ");
        n2 = in.nextInt();

        if (n1 > n2){
            System.out.println("Dentre os numeros informados: "+ n1 + ", e o maior! ");
        }else{
            System.out.println("Dentre os numeros informados: "+ n2 + ", e o maior! ");
        }
    }
}
