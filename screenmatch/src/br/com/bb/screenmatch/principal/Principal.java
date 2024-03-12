package br.com.bb.screenmatch.principal;

import br.com.bb.screenmatch.calculos.CalculadoraDeTempo;
import br.com.bb.screenmatch.calculos.FiltroRecomendacao;
import br.com.bb.screenmatch.modelos.Episodio;
import br.com.bb.screenmatch.modelos.Filme;
import br.com.bb.screenmatch.modelos.Serie;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static <ArraysList> void main(String[] args) {
        Filme meuFilme = new Filme("Rogue One", 2017);
        meuFilme.setDiretorFilme("James Cameron");
        meuFilme.setDuracaoEmMinutos(150);
        meuFilme.exbibeFichaTecnica();

        Filme meuFilme2 = new Filme("Os ultimos JEDI", 2019);
        meuFilme2.setDiretorFilme("James Cameron");
        meuFilme2.setDuracaoEmMinutos(180);
        meuFilme2.exbibeFichaTecnica();

        Serie minhaSerie = new Serie("Sunderland Til I Die", 2018);
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

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Item: " + listaDeFilmes.get(0).getNome());
        System.out.println(meuFilme.toString());
        System.out.println(meuFilme);
    }
}
