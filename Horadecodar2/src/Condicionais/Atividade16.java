package Condicionais;

import java.util.Scanner;

public class Atividade16 {
    //16 - As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas (considere que o usuário informará a quantidade), e calcule e escreva o valor total da compra.
    public static void main(String [] args){
        int quant;
        double conta;
        Scanner in = new Scanner(System.in);

        System.out.println("Ola, esse programa vai te ajudar a comprar maças, cada maça custa 0,30 se levar menos que uma duzia, " +
                "agora se levar apartir de doze cada uma sai por R$ 0,25. ");
        System.out.print("Digita ai quantas maças vai levar?");
        quant = in.nextInt();

        //menos que uma duzia
        if (quant < 12){
            conta = quant * 0.30;
            System.out.println("Voce vai levar " + quant + ", maças, tera que pagar: R$ " + conta);
        }
        if (quant >= 12){
            conta = quant * 0.25;
            System.out.println("Voce vai levar " + quant + ", maças, tera que pagar: R$ " + conta);
        }
    }
}
