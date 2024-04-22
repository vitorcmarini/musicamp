package br.com.alura.musicamp.models;

public class Podcasts extends Audio{
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void about(){
        System.out.println("O titulo " + getTitulo() + "Com o Host " + host + " esta sendo reproduzido.");
        System.out.println(String.format("O titulo %s já foi reproduzido %d vezes.", getTitulo(), getTotalDeReproducoes()));
        System.out.println(String.format("O titulo %s foi curtido %d vezes", getTitulo(), getCurtidas()));
    }

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
