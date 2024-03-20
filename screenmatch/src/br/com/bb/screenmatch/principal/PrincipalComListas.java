package br.com.bb.screenmatch.principal;

import br.com.bb.screenmatch.modelos.Filme;
import br.com.bb.screenmatch.modelos.Serie;
import br.com.bb.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Rogue One", 2017);
        Filme meuFilme2 = new Filme("Os ultimos JEDI", 2019);
        Serie minhaSerie = new Serie("Sunderland Til I Die", 2018);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(minhaSerie);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme) {
                Filme filme = (Filme) item;
                System.out.println(filme.getClassificacao());
            }
        }

        // lista.forEach(item -> System.out.println(item.getNome()));

        System.out.println("Lista não ordenada!");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada de filmes e séries!");
        System.out.println(lista);


    }

}

