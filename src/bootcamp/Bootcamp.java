package bootcamp;

import java.time.LocalDate;

import bootcamp.curso.Curso;
import bootcamp.mentoria.Mentoria;

public class Bootcamp{
    public static void main(String[] args) throws Exception{
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("");
        curso.setDescricao("");
        curso.setCarga(1);

        mentoria.setTitulo("");
        mentoria.setDescricao("");
        mentoria.setData(LocalDate.now());
    }
}
