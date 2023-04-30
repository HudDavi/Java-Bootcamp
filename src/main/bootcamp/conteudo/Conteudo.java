package main.bootcamp.conteudo;

public abstract class Conteudo{
    private String titulo;
    private String descricao;
    protected int xp = 10;

    public abstract int conteudo();

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

}