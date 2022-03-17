package com.senac.exercicio1poo;

public class Curso0 {
    //Atributos
    private String nomeCurso;
    private String nomeProfessor;
    //Métodos
    public void apresentaMensagem (){
            System.out.println("Olá, seja bem vindo ao curso "+nomeCurso+" sob a responsabilidade do professor "+nomeProfessor);
    
}
    public void setnomeCurso(String c){
        nomeCurso=c;
    }
    public String getnomeCurso(){
        return nomeCurso;
    }
    public void setnomeProfessor(String p){
        nomeProfessor=p;    
    }
    public String getnomeProfessor(){
        return nomeProfessor;
    }
}