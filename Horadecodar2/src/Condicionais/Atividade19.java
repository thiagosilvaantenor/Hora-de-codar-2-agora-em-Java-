package Condicionais;

import java.util.Scanner;

public class Atividade19 {
    //19 - Escreva um programa para ler o número de gols marcados pelo Grêmio e o número de gols marcados pelo Inter em um GRENAL. Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.
    public static void main(String[] args) {
        Scanner gols = new Scanner(System.in);
        int gremio;
        int inter;

        System.out.println("Esse programa ira falar quantos gols foram marcados, pelo Grêmio e o Inter em um GRENAL");

        System.out.println("Digite quantos gols o Gremio fez");
        gremio = gols.nextInt();

        System.out.println("Agora digite quantos gols o Inter fez");
        inter = gols.nextInt();

        if (gremio == inter) {
            System.out.println("E O RESULTADO FINAL É ... EMPATE!");
        } else if (gremio > inter) {
            System.out.println("E O VENCEDOR É ... O GREMIO!");
        } else if (gremio < inter) {
            System.out.println("E O VENCEDOR É ... O INTER!");
        }
    }
}