package com.senac.exercicio1poo;
import java.util.Scanner;
public class Curso1 {

    public static void main(String[] args) {
    Scanner s=new  Scanner(System.in);
    Curso0 a1= new Curso0();
    
    System.out.println("Digite o nome do curso: ");
    a1.setnomeCurso(s.nextLine());
    
    System.out.println("Digite o nome do professor: ");
    a1.setnomeProfessor(s.nextLine());
    
    a1.apresentaMensagem();
    
    }
    
}
