package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Descrição curso JAVA");
    curso1.setCargaHoraria(0);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso JS");
    curso2.setDescricao("Descrição curso JS");
    curso2.setCargaHoraria(4);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria de Java");
    mentoria1.setDescricao("Descrição mentoria JAVA");
    mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);

}
}
