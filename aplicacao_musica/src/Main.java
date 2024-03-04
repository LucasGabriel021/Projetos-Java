import br.com.aplicacao_musica.modelos.MinhasPreferencias;
import br.com.aplicacao_musica.modelos.Musica;
import br.com.aplicacao_musica.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Survivor");
        minhaMusica.setNomeBanda("The Score");
        minhaMusica.setAlbum("Deep End");
        minhaMusica.setDuracao(2.55);

        for (int i = 0; i < 20000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 10000; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Correspondentes Premier");
        meuPodcast.setDescricao("O Tottenham é muito Gigante");
        meuPodcast.setParticpante("João Castelo Branco, Renato Senesi e Natalie Gedra");
        meuPodcast.setDuracao(40.5);

        for (int i = 0; i < 100000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 9000; i++) {
            meuPodcast.curtir();
        }

        minhaMusica.exibirInfos();
        meuPodcast.exibirInfos();

        MinhasPreferencias classificar = new MinhasPreferencias();
        classificar.inlcui(minhaMusica);
        classificar.inlcui(meuPodcast);
    }
}
