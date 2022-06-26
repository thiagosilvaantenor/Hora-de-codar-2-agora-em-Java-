package Condicionais;
import java.util.Scanner;

public class Atividade12 {
    //12 - A equipe Mercedes deseja calcular o número mínimo de litros que deverá colocar no tanque de seu carro para que ele possa percorrer um determinado número de voltas até o primeiro reabastecimento.
    //Escreva um programa que leia o comprimento da pista (em metros), o número total de voltas a serem percorridas no grande prêmio, o número de reabastecimentos desejados e o consumo de combustível do carro (em Km/L).
    //
    //O programa deve calcular e exibir o número mínimo de litros necessários para percorrer até o primeiro reabastecimento.
    //Observação: considere que a quantidade de voltas entre os reabastecimentos é o mesmo, mas não poderá ser maior ou igual a 2.
    //
    //O usuário deve informar a quantidade de quilômetros total do circuito e a quantidade de litros que o carro pode possuir.
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //Comprimento da pista
        System.out.println("Por favor, informe o comprimento da pista(em metros)");
        int n1 = in.nextInt();

        //Numero total de voltas
        System.out.println("Por favor, informe o numero total de voltas da corrida");
        int n2 = in.nextInt();

        //Reabastecimentos desejados
        System.out.println("Por favor, informe o numero de reabastecimentos desejados");
        int n3 = in.nextInt();

        //Consumo em Km/L
        System.out.println("Por favor, informe o consumo do carro em Km/L");
        int n4 = in.nextInt();

        //Quantos km serão percorridos
        int km = (n1 * n2) / 1000;
        
        int total = (km / n3) / n4;


        if (n2 > 2){
            System.out.println("Tente novamente, o numero de voltas entre os reabastecimentos tem que ser menor ou igual a 2");
        }
        else if (n2 < 2 && n2 == 2){
          System.out.println("A quantidade de combustivel até o primeiro reabastecimento " + total + " Litros");
        }


    }
}
