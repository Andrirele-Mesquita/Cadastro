package br.senai.sp.poointroducao;

import java.util.Scanner;

public class Register {
    boolean flag = true;
    /** Instanciar Scanner */
    Scanner teclado = new Scanner(System.in);

    /** intanciar output*/
    Output objOutput= new Output();


        public void BothRegister() {
            flag = false;

            registroAluno();
            registerProfessor();

        }


    public void registerProfessor() {


        /** Instanciar Teacher */
        Teacher objTeacher = new Teacher();

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("Hello Teacher, What is your name: ");
        objTeacher.name = teclado.next();
        System.out.println("How old are you: ");
        objTeacher.age = teclado.nextInt();
        System.out.println("What is your email: ");
        objTeacher.email = teclado.next();
        System.out.println("Tell me your phone number: ");
        objTeacher.phoneNumber = teclado.nextInt();
        System.out.println("What is you specialist: ");
        objTeacher.specialist = teclado.next();
        System.out.println("-*-*-*-*-*-*-*-*-*--*-*--*-*-*-*-*-*-*-*-*");

        if (flag) {
            objOutput.printeTeacher(objTeacher);
        }
    }

     public void registroAluno() {

       /** Instanciar Alunos */
        Alunos objAlunos = new Alunos();

        /**Instance Aluno */

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/--/-/--/--/-/-/-");
        System.out.println("Olá Estudante, informe seu nome: ");
        objAlunos.nome = teclado.next();
        System.out.println("Informe sua Idade: ");
        objAlunos.idade = teclado.nextInt();
        System.out.println("Qual é o Seu email?: ");
        objAlunos.email = teclado.next();
        System.out.println("Informe sua Nota1: ");
        objAlunos.nota1 = teclado.nextInt();
        System.out.println("Informe sua Nota2: ");
        objAlunos.nota2 = teclado.nextInt();
        System.out.println(" informe sua frequencia");
        objAlunos.frequencia = teclado.nextInt();

        if (flag) {
            objOutput.printeStudante(objAlunos);
        }


    }


}
