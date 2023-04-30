package main.bootcamp.conteudo.mentoria;

import java.time.LocalDate;

import main.bootcamp.conteudo.Conteudo;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public int conteudo() {
        return xp + 20;
    }

}