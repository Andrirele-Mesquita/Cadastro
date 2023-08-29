package br.senai.sp.poointroducao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** Intance Register */
        Register objRegister = new Register();

        /**Instance Scanner */
        Scanner teclado = new Scanner(System.in);

        System.out.println(" O que quer cadsatrar [1-prof ,2-aluno , 3-Ambos ]");
        int opcao = teclado.nextInt();

        if (opcao == 1) {
            objRegister.registerProfessor();

        } else if (opcao == 2) {
            objRegister.registroAluno();


        } else if (opcao == 3) {
           objRegister.BothRegister();


        }else {
            System.out.println("opção invalida");
        }

    }
}
