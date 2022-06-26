package Condicionais;

import java.util.Scanner;

public class Atividade13 {
    //13 - Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).

    public static void main (String [] args){
        int n1, n2, n3, n4;
        int media;
        Scanner in = new Scanner(System.in);

        //valor1
        System.out.println("Ola, por favor, informe a sua primeira nota:");
        n1 = in.nextInt();

        //valor2
        System.out.println("Por favor, informe, a segunda nota: ");
        n2 = in.nextInt();

        //valor3
        System.out.println("Por favor, informe, a terceira nota: ");
        n3 = in.nextInt();

        //valor4
        System.out.println("Por favor, informe, a quarta nota: ");
        n4 = in.nextInt();

        //media
        media = (n1 + n2 + n3 + n4) / 4;

        //Aprovado
        if (media >= 6) {
            System.out.println("PARABÉNS! Você foi aprovado!, sua media foi: " + media);
        }
        //Reprovado
        else  {
            System.out.println("Infelizmente você foi reprovado, sua media foi: " + media);
        }


    }
}
