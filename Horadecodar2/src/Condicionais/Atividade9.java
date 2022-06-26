package Condicionais;

import java.util.Scanner;

public class Atividade9 {
    //9. Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior a 72 devem ser somados. Escreva o valor final da soma efetuada e também todos valores que o usuário informou.
    public static void main(String[] args) {

        int n1, n2, n3, n4, n5, n6;
        int soma = 0;
        Scanner in = new Scanner(System.in);

        //valor1
        System.out.println("Por favor, informe um numero: ");
        n1 = in.nextInt();

        //valor2
        System.out.println("Informe, mais um numero: ");
        n2 = in.nextInt();

        //valor3
        System.out.println("Informe, mais um numero: ");
        n3 = in.nextInt();

        //valor4
        System.out.println("Informe, mais um numero: ");
        n4 = in.nextInt();

        //valor5
        System.out.println("Informe, mais um numero: ");
        n5 = in.nextInt();

        //valor6
        System.out.println("Informe, mais um numero: ");
        n6 = in.nextInt();

        if (n1 < 72){
        soma += n1;
        }
        if (n2 < 72){
            soma += n2;
        }
        if (n3 < 72){
            soma += n3;
        }
        if (n4 < 72){
            soma += n4;
        }
        if (n5 < 72){
            soma += n5;
        }
        if (n6 < 72){
            soma += n6;
        }

        System.out.println("A soma dos numeros menores que 72 foi: " + soma);
        System.out.print("Esses foram os numeros informados: " + n1  + ","+ n2 + ","+ n3 + ","+ n4 + ","+ n5 + ", e " + n6);
    }
}
