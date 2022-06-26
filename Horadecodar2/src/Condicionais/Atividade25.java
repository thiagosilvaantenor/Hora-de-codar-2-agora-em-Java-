package Condicionais;

import java.util.Scanner;

public class Atividade25 {
    //25 - Uma micro calculadora
    //Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem
    //executadas (codificada da seguinte forma: 1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação).
    //O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos. Observação: Considere
    //que só serão lidos os valores 1, 2, 3 ou 4 para as operações

    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int n1;
        int n2;

        System.out.println("Ola, esse programa é uma micro calculadora, digite de acordo com, qual operação deseja fazer: 1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação");
        int op = in.nextInt();

        System.out.println("Digite o primeiro valor da operaçao escolhida: ");
        n1 = in.nextInt();

        System.out.println("Digite o segundo valor da operaçao escolhida: ");
        n2 = in.nextInt();

        switch (op){
            case 1:
               int soma = n1 + n2;
                System.out.println("Voce escolheu uma soma, o resultado da operação foi: " + soma);
                break;
            case 2:
                int subtracao = n1 - n2;
                System.out.println("Voce escolheu uma subtração, o resultado da operação foi: " + subtracao);
                break;
            case 3:
                int divisao = n1 / n2;
                System.out.println("Voce escolheu uma divisão, o resultado da operação foi: " + divisao);
                break;
            case 4:
                int multiplicacao = n1 * n2;
                System.out.println("Voce escolheu uma multiplicação, o resultado da operação foi: " + multiplicacao);
                break;
            default:
                System.out.println("OPA! Operação invalida, escolha uma das opções de operação utilizando de 1 a 4!");


        }

    }
}
