package br.com.dio.desafio.Dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(12);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(5);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        /System.out.println(curso2);
//        System.out.println(mentoria);

        bootcamp bootcamp = new bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDerscricao("Descricão do Bootcamp java ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDiogo = new Dev();
        devDiogo.setNome("Diogo");
        devDiogo.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos de Diogo " + devDiogo.getConteudosInscritos());

        devDiogo.progredir();
        devDiogo.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos de Diogo " + devDiogo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Diogo " + devDiogo.getConteudosConcluidos());
        System.out.println("XP:" + devDiogo.calcularTotalXp());

        System.out.println("---------------------------");

        Dev devLet = new Dev();
        devLet.setNome("Leticia");
        devLet.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos de Leticia" + devLet.getConteudosInscritos());

        devLet.progredir();
        devLet.progredir();
        devLet.progredir();
        System.out.println("-");

        System.out.println("Conteudos Inscritos de Leticia " + devLet.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Leticia " + devLet.getConteudosConcluidos());
        System.out.println("XP:" + devLet.calcularTotalXp());



    }
}
