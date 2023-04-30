package main;

import java.time.LocalDate;

import main.bootcamp.Bootcamp;
import main.bootcamp.conteudo.curso.Curso;
import main.bootcamp.conteudo.mentoria.Mentoria;
import main.dev.Dev;

public abstract class Main{
    public static void main(String[] args) throws Exception{
        Curso cursoJava = new Curso();
        Curso cursoJavaScript = new Curso();
        Mentoria mentoriaJava = new Mentoria();
        Mentoria mentoriaJavaScript = new Mentoria();

        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Curso de Java");
        cursoJava.setCarga(80);

        cursoJavaScript.setTitulo("Curso de JavaScript");
        cursoJavaScript.setDescricao("Curso de JavaScript");
        cursoJavaScript.setCarga(70);

        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Mentoria de Java");
        mentoriaJava.setData(LocalDate.now());

        mentoriaJavaScript.setTitulo("Mentoria de JavaScript");
        mentoriaJavaScript.setDescricao("Mentoria de JavaScript");
        mentoriaJavaScript.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java Developer");
        bootcampJava.setDescricao("Descrição Bootcamp Java Developer");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(mentoriaJava);

        Bootcamp bootcampJavaScript = new Bootcamp();
        bootcampJavaScript.setNome("Bootcamp JavaScript Developer");
        bootcampJavaScript.setDescricao("Descrição Bootcamp JavaScript Developer");
        bootcampJavaScript.getConteudos().add(cursoJavaScript);
        bootcampJavaScript.getConteudos().add(mentoriaJavaScript);

        Dev devHudson = new Dev();
        devHudson.setNome("Hudson");
        devHudson.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos para Hudson:" + devHudson.getConteudosInscritos());
        devHudson.progredir();
        System.out.println("Conteúdos Inscritos para Hudson:" + devHudson.getConteudosInscritos());
        devHudson.progredir();
        System.out.println("Conteúdos Concluídos por Hudson:" + devHudson.getConteudosConcluidos());
        System.out.println("XP:" + devHudson.calcular());

        System.out.println("");

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcampJavaScript);
        System.out.println("Conteúdos Inscritos para Davi:" + devDavi.getConteudosInscritos());
        devDavi.progredir();
        System.out.println("Conteúdos Inscritos para Davi:" + devDavi.getConteudosInscritos());
        devDavi.progredir();
        System.out.println("Conteúdos Concluidos por Davi:" + devDavi.getConteudosConcluidos());
        System.out.println("XP:" + devDavi.calcular());
    }
}