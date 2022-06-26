package Condicionais;

import java.util.Scanner;

public class Atividade24 {
    //24 - Um zoológico muito louco
    //Escreva um programa que leia a idade de 2 javalis e 2 girafas (considere que a idade dos javalis será sempre diferente, assim como das girafas ). Calcule e escreva a soma das idades do javali mais velho com a girafa mais nova, e o produto das idades do javali mais novo com a girafa mais velha.
public static void main (String [] args){
    Scanner in = new Scanner(System.in);
    int j1, j2;
    int g1, g2;

    System.out.println("Coloque a idade do primeiro javali");
    j1 = in.nextInt();
    System.out.println("Coloque a idade do segundo javali");
    j2 = in.nextInt();
    System.out.println("Coloque a idade da primeira girafa");
    g2 = in.nextInt();
    System.out.println("Coloque a idade da segunda girafa");
    g1 = in.nextInt();

    if (j1 > j2 && g1 > g2){

        int soma = j1 + g2;
        int produto = j2 * g1;

        System.out.println("A soma das idades do javali mais velho com a girafa mais nova e igual a: " + soma);

        System.out.println("O produto das idades do javali mais novo com a girafa mais velha e : " + produto);
    }

    else if(j1 > j2 && g2 > g1 ){

        int soma1 = j1 + g2;
        int produto1 = j2 * g1;
        System.out.println("A soma das idades do javali mais velho com a girafa mais nova e igual a: " + soma1);

        System.out.println("O produto das idades do javali mais novo com a girafa mais velha e : " + produto1);
    }
    else if(j2 > j1 && g1 > g2 ){

        int soma2 = j1 + g2;
        int produto2 = j2 * g1;
        System.out.println("A soma das idades do javali mais velho com a girafa mais nova e igual a: " + soma2);

        System.out.println("O produto das idades do javali mais novo com a girafa mais velha e : " + produto2);
    }

    else if(j2 > j1 && g2 > g1 ){

        int soma3 = j2 + g1;
        int produto3 = j1 * g2;
        System.out.println("A soma das idades do javali mais velho com a girafa mais nova e igual a: " + soma3);

        System.out.println("O produto das idades do javali mais novo com a girafa mais velha e : " + produto3);
    }

    else{
        System.out.print("OPA! Idades iguais.");
    }

}
}
