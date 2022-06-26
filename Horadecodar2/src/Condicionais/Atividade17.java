package Condicionais;

import java.util.Scanner;

public class Atividade17 {
    //17 - Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número "1234" sem aspas. Devem ser impressas as seguintes mensagens: "ACESSO PERMITIDO" caso a senha seja válida. "ACESSO NEGADO" caso a senha seja inválida.
    public static void main (String [] args){
        int senha;
        Scanner in = new Scanner(System.in);
        System.out.println("Ola, esse programa irá validar sua senha, por favor, digite ela");
        senha = in.nextInt();

        if (senha == 1234){
            System.out.println("SENHA CORRETA E VALIDADA, ACESSO PERMITIDO");
        }
        else {
            System.out.println("SENHA INCORRETA, ACESSO NEGADO");
        }
    }
}
