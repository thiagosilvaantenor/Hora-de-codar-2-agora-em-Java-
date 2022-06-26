package Condicionais;

import java.util.Scanner;

public class Atividade14 {
    //14 - Acrescente ao exercício anterior a mensagem "Infelizmente, você foi reprovado!" caso a média calculada seja menor que 6.0.
    public static void main (String[] args){
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
            else if (media < 6) {
                System.out.println("Infelizmente você foi reprovado, sua media foi: " + media);
            }

        }
    }