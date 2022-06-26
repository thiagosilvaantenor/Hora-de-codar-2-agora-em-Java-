package Condicionais;

import java.util.Scanner;

public class Atividade11 {
    //11 - Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
    //Sabendo-se que o preço do combustível é de R$ 2,90, escreva um programa para ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. Sabendo que o carro desse taxista roda 14 kilômetros por litro de gasolina, crie um programa que calcule e escreva: a média do consumo em Km/L e o lucro (líquido) do dia.
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        //media de consumo
        double mediaConsumo;

        //media de lucro
        double mediaLucro;

        System.out.println("Fala meu(minha) querido(a) taxista? Esse programa aqui é pra ti. Ele vai lhe dizer a media de consumo Kilometros por Litro e a media de lucro do dia");

        //inicio
        System.out.println("Por favor, informe qual a marcacao do odometro no inicio do dia");
        double inicio = in.nextDouble();

        //final
        System.out.println("Legal, agora informe qual a marcacao no fim do dia");
       double fim = in.nextInt();

        //Gasolina gasta
        System.out.println("Muito bem, agora informe quantos litros de gasolina foram gastos no dia");
       double litros = in.nextInt();

        //lucro
        System.out.println("Tamo quase la, informe quanto foi o valor recebido dos passagueiros no dia");
       double lucro = in.nextInt();

        // media do consumo
        mediaConsumo = (inicio - fim) / litros;

        // lucro liquido
        mediaLucro = (lucro - 2.90) * litros;

        System.out.println("A media de consumo em Km/L foi: " + mediaConsumo);
        System.out.print("Ja a media de lucro liquido foi: " + mediaLucro);

    }


}
