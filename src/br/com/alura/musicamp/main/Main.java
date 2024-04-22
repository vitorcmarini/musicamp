import br.com.alura.musicamp.models.Musicas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Musicas musica = new Musicas();
        musica.setTitulo("In The End");
        musica.setDuracao(240);
        musica.setArtista("Linking Park");
        musica.setClassificacao(5);

        System.out.println(String.format("A musica %s do %s que tem a duracao de %d segundos, e a classificação de %.2f estrelas está sendo tocada!!"
                , musica.getTitulo(), musica.getArtista(), musica.getDuracao(), musica.getClassificacao()));

    }
}