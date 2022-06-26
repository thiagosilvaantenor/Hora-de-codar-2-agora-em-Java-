package Condicionais;

import java.util.Scanner;

public class Atividade21 {
    //21 - Escreva um programa que leia as notas das duas avaliações normais e a nota da avaliação optativa. Calcular a média do semestre considerando que a prova optativa substitui a nota mais baixa entre as duas primeiras avaliações. Escrever a média e mensagens que indiquem se o aluno foi aprovado, reprovado ou está em exame, de acordo com as informações abaixo:

    //Aprovado: media >= 6.0
    //Reprovado: media < 3.0
    //Exame : media>=3.0 e 6.0
    public static void main(String [] args){
    double nota1, nota2, nota3;
        Scanner nota = new Scanner(System.in);
        System.out.println("Ola, esse programa irá ler suas notas e calcular a media do semestre");
        System.out.print("Digite sua nota na primeira avaliação: ");
        nota1 = nota.nextDouble();
        System.out.println("Digite sua nota na segunda avaliação: ");
        nota2 = nota.nextDouble();
        System.out.println("Digite sua nota na avaliação optativa: ");
        nota3 = nota.nextDouble();

        if (nota1 > nota2){
        nota2 = nota3;
        }
        else {
            nota1 = nota3;
        }

        double media = (nota1 + nota2) / 2;
        //Aprovado
        if (media >= 6.0){
            System.out.println("Você foi aprovado, parabéns! Sua media foi: " + media);
        }
        //Reprovado
        else if (media < 3.0) {
            System.out.println("Você foi reprovado! Sua media foi: " + media);
        }

        //Exame
        else if (media >= 3.0 && media < 6.0){
            System.out.println("Você está em Exame! Sua media foi: " + media);

        }
    }
}
