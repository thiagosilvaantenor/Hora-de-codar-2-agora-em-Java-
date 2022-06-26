package Condicionais;

import java.util.Scanner;

public class Atividade20 {
    //20 - Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
    //Calcular e imprimir o seguinte:
    //Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu perímetro.
    //Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
    //Se o número de lados for igual a 5 escrever PENTAGONO.
    //Observação: Considere que o usuário só informará os valores 3, 4 ou 5.
    //Caso o número de lados seja inferior a 3 escrever NÃO É UM POLIGONO.
    //Caso o número de lados seja superior a 5 escrever POLIGONO NÃO IDENTIFICADO.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Ola, por favor, informe a quantidade de lados do poligono: ");
        int lados = in.nextInt();

        System.out.println("Agora, informe qual a medida dos lados do poligono:");
        int medida = in.nextInt();

        int perimetro = medida + medida + medida;
        int area = medida + medida;


        if (lados == 3) {
            System.out.println("Esse poligono é ... UM TRIANGULO! E o perimetro dele é: " + perimetro);
        } else if (lados == 4) {
            System.out.println("Esse poligono é ... UM QUADRADO! E a area dele é: " + area);
        } else if (lados == 5) {
            System.out.println("Esse poligono é ... UM PENTAGONO");
        }
        else if (lados < 3) {
            System.out.println("ISSO NÃO É UM POLIGONO");
        }
        else{
            System.out.println("POLIGONO NÃO IDENTIFICADO");
        }
    }
}
