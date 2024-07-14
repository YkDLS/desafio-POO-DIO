package br.com.dio.desafio.Dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descrição curso java");
        curso2.setCargaHoraria(12);


        System.out.println(curso1);
        System.out.println(curso2);

     Mentoria mentoria = new Mentoria();

     mentoria.setTitulo("Mentoria de java");
     mentoria.setDescricao("Descricao mentoria java");
     mentoria.setData(LocalDate.now());

        System.out.println(mentoria);


    }
}
