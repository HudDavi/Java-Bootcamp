package main.bootcamp.conteudo.curso;

import main.bootcamp.conteudo.Conteudo;

public class Curso extends Conteudo{
    private int carga;

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public int conteudo() {
        return xp * carga;
    }
}