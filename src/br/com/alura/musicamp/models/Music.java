package br.com.alura.musicamp.models;

public class Musicas extends Audio{
    private String artist;
    private String album;
    private String gender;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void about(){
        System.out.println(String.format("A musica %s do %s que tem a duracao de %d segundos, e a classificação de %d estrelas está sendo tocada!!"
                , getTitulo(), artist, getDuracao(), getClassificacao()));
        System.out.println("O titulo " + getTitulo() + " esta sendo reproduzido.");
        System.out.println(String.format("O titulo %s já foi reproduzido %d vezes.", getTitulo(), getTotalDeReproducoes()));
        System.out.println(String.format("O titulo %s foi curtido %d vezes", getTitulo(), getCurtidas()));
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeReproducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
