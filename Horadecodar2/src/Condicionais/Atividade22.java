package Condicionais;

import java.util.Scanner;

public class Atividade22 {
//22. A Loja Remi du Fromage está com uma promoção onde cada capacete artesanal para tartaruga custa R$18.230 e pode ser pago em até 15 vezes sem juros. Crie um programa onde o usuário possa informar o valor parcelas que deseja pagar e exiba o valor de cada parcela.

    public static void main(String [] args){
        double capacete = 18.230;
        int parcelas;
        Scanner x = new Scanner(System.in);

        System.out.println("PROMOÇÃO NA LOJA REMI du FROMAGE! CADA CAPACETE ARTESANAL PARA TARTARUGA POR R$ 18,23. O GERENTE FICOU MALUCO! PODE PARCELAR EM ATÉ 15VEZES SEM JUROS!");

        System.out.println("Informe o numero de parcelas que deseja fazer: ");
        parcelas = x.nextInt();

        double total = capacete / parcelas;

        if (parcelas >=1 && parcelas <= 15){
            System.out.println("O valor das parcelas vai ser: R$ " + total);
        }
        else {
            System.out.println("Por favor, informe novamente o valor da parcelas, lembrando que é aceito até 15 vezes sem juros");
        }
    }

}
