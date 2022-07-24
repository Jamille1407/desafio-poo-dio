package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Descrição curso JAVA");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso JS");
    curso2.setDescricao("Descrição curso JS");
    curso2.setCargaHoraria(4);

    Conteudo conteudo = new Curso();

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria de Java");
    mentoria1.setDescricao("Descrição mentoria JAVA");
    mentoria1.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java developer");
    bootcamp.setDescricao("Descrição Bootcamp java developer ");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria1);

    Dev dev1 = new Dev();
    dev1.setNome("Jamille da silva");
    dev1.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos inscritos Jamille da silva: " + dev1.getConteudosInscritos());
    System.out.println("-");
    dev1.progredir();
    dev1.progredir();

    System.out.println("Conteúdos inscritos Jamille da silva: " + dev1.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos Jamille da silva: " + dev1.getConteudosConcluidos());
    System.out.println("XP" + dev1.calcaularTotalXp());

    System.out.println("------");

    Dev dev2 = new Dev();
    dev2.setNome("Maria ");
    dev2.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos inscritos Maria: " + dev2.getConteudosInscritos());
    System.out.println("-");
    dev2.progredir();

    System.out.println("Conteúdos inscritos Maria: " + dev2.getConteudosInscritos());
    System.out.println("Conteúdos Concluidos Maria: " + dev1.getConteudosConcluidos());
    System.out.println("XP" + dev2.calcaularTotalXp());
    System.out.println("------");


        //System.out.println(curso1);
        //System.out.println(curso2);

}
}
