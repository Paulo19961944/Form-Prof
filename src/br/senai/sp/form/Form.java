package br.senai.sp.form;
import java.util.Scanner;

public class Form {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /** Formulario */
        String[] nomes = new String[2];
        System.out.print("Qual o nome do Prof 1: ");
        nomes [0] = teclado.nextLine();

        System.out.print("Qual o nome do Prof 2: ");
        nomes [1] = teclado.nextLine();
        System.out.println("Olá prof's " + nomes[0] + " e " + nomes[1] + " Sejam bem vindos");

        int [] idade = new int[2];
        System.out.print("Qual é a idade do Prof 1: ");
        idade [0]= teclado.nextInt();

        System.out.print("Qual é a idade do Prof 2: ");
        idade [1] = teclado.nextInt();
        System.out.println("A idade do Prof 1 e: " + idade[0] + " \n A idade do Prof 2 e " + idade[1]);

        int [] peso = new int[2];
        System.out.print("Qual é a peso do Prof 1: ");
        peso [0]= teclado.nextInt();

        System.out.print("Qual é o peso do Prof 2: ");
        peso [1]= teclado.nextInt();
        System.out.println("O peso do Prof1 e: " + peso[0] + " \n O peso do Prof2 e: " + peso[1]);

        float [] altura = new float[2];
        System.out.print("Qual é altura do Prof 1: ");
        altura [0]= teclado.nextFloat();

        System.out.print("Qual é a altura do Prof 2: ");
        altura [1]= teclado.nextFloat();
        System.out.println("A altura do Prof1 e: " + altura[0] + "\nA altura do Prof2 e: " + altura[1]);

        int [] RG = new int[2];
        System.out.print("O RG do Prof 1: ");
        RG [0]= teclado.nextInt();

        System.out.print("O RG do Prof 2: ");
        RG [1]= teclado.nextInt();
        System.out.println("O RG do Prof1 e: " + RG[0] + "\nO RG do Prof2 e: " + RG[1]);

        long [] CPF = new long[2];
        System.out.print("O CPF do Prof 1: ");
        CPF [0]= teclado.nextLong();

        System.out.print("O CPF do Prof 2: ");
        CPF [1]= teclado.nextLong();
        System.out.println("O CPF do Prof1 e: " + CPF[0] + "\nO CPF do Prof2 e: " + CPF[1]);

        String [] Profissao = new String[2];
        System.out.print("A Profissao do Prof 1: ");
        Profissao [0]= teclado.next();

        System.out.print("A Profissao do Prof 2: ");
        Profissao [1]= teclado.next();
        System.out.println("A Profissao do Prof1 e: " + Profissao[0] + "\nA Profissao do Prof2 e: " + Profissao[1]);

        String [] Curso = new String[2];
        System.out.print("O Curso do Prof 1: ");
        Curso [0]= teclado.next();

        System.out.print("A Curso do Prof 2: ");
        Curso [1]= teclado.next();
        System.out.println("O Curso do Prof1 e: " + Curso[0] + "\nO Curso do Prof2 e: " + Curso[1]);
    }
}
