package Condicionais;

import java.util.Scanner;

public class Atividade10 {
    //10. Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"
    public static void main (String[] args) {
        int n1, n2, n3, n4;
        int media = 0;
        int resultado;
        Scanner in = new Scanner(System.in);

        //valor1
        System.out.println("Por favor, informe um numero: ");
        n1 = in.nextInt();

        //valor2
        System.out.println("Informe, o segundo numero: ");
        n2 = in.nextInt();

        //valor3
        System.out.println("Informe, o terceiro numero: ");
        n3 = in.nextInt();

        //valor4
        System.out.println("Informe, o quarto numero: ");
        n4 = in.nextInt();

        if(n1 > 0 && n1 < 10){
            media += n1;
        }
        if(n2 > 0 && n2 < 10){
            media += n2;
        }
        if(n3 > 0 && n3 < 10){
            media += n3;
        }
        if(n4 > 0 && n4 < 10){
            media += n4;
        }

        //media
        resultado = media / 4;

        //passou
        if (resultado >= 5){
        System.out.println("Parabens, voce passou no teste, sua media foi: " + resultado);
        }
        //reprovou
        else{
            System.out.println("Tente novamente, sua media foi: " + resultado);
        }
    }

}
