import br.com.bb.screenmatch.calculos.CalculadoraDeTempo;
import br.com.bb.screenmatch.calculos.FiltroRecomendacao;
import br.com.bb.screenmatch.modelos.Episodio;
import br.com.bb.screenmatch.modelos.Filme;
import br.com.bb.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Rogue One");
        meuFilme.setAnoDeLancamento(2017);
        meuFilme.setDiretorFilme("James Cameron");
        meuFilme.setDuracaoEmMinutos(150);
        meuFilme.exbibeFichaTecnica();

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Os ultimos JEDI");
        meuFilme2.setAnoDeLancamento(2019);
        meuFilme2.setDiretorFilme("James Cameron");
        meuFilme2.setDuracaoEmMinutos(180);
        meuFilme2.exbibeFichaTecnica();

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Sunderland Til I Die");
        minhaSerie.setAnoDeLancamento(2018);
        minhaSerie.setTemporadas(3);
        minhaSerie.setEpisodiosPorTemporada(6);
        minhaSerie.setMinutosPorEpisodio(50);
        minhaSerie.exbibeFichaTecnica();
        System.out.println(minhaSerie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(meuFilme);
        calculadora.incluir(meuFilme2);
        calculadora.incluir(minhaSerie);
        System.out.println("Calculadora de tempo: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(meuFilme);
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(20);
    }
}
