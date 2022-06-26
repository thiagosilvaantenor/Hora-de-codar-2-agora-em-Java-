package Repeticao;

import java.util.Scanner;

public class Atividade5 {
    //5 - Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        double nota = 0;
        double soma = 0;
        double media = 0;

        Scanner in = new Scanner(System.in);
        for (int i = 1; i <= 4; i++){
            System.out.printf("Informe sua %dº nota: ",i);
            nota = in.nextDouble();
            soma += nota; // soma = soma + nota//
            media = soma / 4;
        }
        if (media >= 6.0){
            System.out.println("PARABÉNS! Você foi aprovado com a média: "+media);
        }else{
            System.out.println("Infelizmente, você foi reprovado com a media: "+media);
        }
    }
}
