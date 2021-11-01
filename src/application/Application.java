package application;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        System.out.println("--\tOrdem aleótora--\t");
        /*
         * Fazendo uso da interface Map, conforme exercico a baixo, criamos uma class livro,
         * estamos instanciando a baixo, e colocando valores dentro de livros atraves da interface map,
         * a interface map tem uma peculiariade, para adicionar informacoes, não se usa o ADD, mas o PUT
         * veja exemplos a baixo;
         */


        Map<String, Livro> livros = new HashMap<>(){{
            put("Fernando Silva", new Livro("Java 8", 100));
            put("Tania Silva", new Livro("Java 11", 150));
            put("Elias Silva", new Livro("Java 17", 200));
            put("Heloisa Silva", new Livro("Lógica de programacão", 90));
            put("Davi Silva", new Livro("Spring boot", 80));
        }};

        /*
         * Estamos fazendo uma varedura na lista inserida a cima, estamos pedindo para
         * nos retornar apenas nome do autor do livro, Livro e quanta paginas
         * Autor: Tania Silva - livro: Java 11 paginas
         * Autor: Davi Silva - livro: Spring boot paginas
         * Autor: Elias Silva - livro: Java 17 paginas
         * Autor: Fernando Silva - livro: Java 8 paginas
         * Autor: Heloisa Silva - livro: Lógica de programacão paginas
         *
         * sem o devido tratamento a impressao sairia assim: veja a baixo em uma unica linha muito horrivel né
         * {Tania Silva={name='Java 11', pagina=150}, Davi Silva={name='Spring boot', pagina=80}, Elias Silva={name='Java 17', pagina=200},
         * Fernando Silva={name='Java 8', pagina=100}, Heloisa Silva={name='Lógica de programacão', pagina=90}}
         */
        for (Map.Entry<String, Livro> liv: livros.entrySet()) {
            System.out.println("Autor: "+ liv.getKey() + " - " + "livro: " +liv.getValue().getName() + " paginas");
        }


        System.out.println("--\tOrdem de inserção--\t");
        /* Mesma implementação com o LinkedHashMap neste caso ele fará a impressão na ordem em que foi inserido */

        Map<String, Livro> livros1 = new LinkedHashMap<>() {{
            put("Fernando Silva", new Livro("Java 8", 100));
            put("Tania Silva", new Livro("Java 11", 150));
            put("Elias Silva", new Livro("Java 17", 200));
            put("Heloisa Silva", new Livro("Lógica de programacão", 90));
            put("Davi Silva", new Livro("Spring boot", 80));
        }};
        for (Map.Entry<String, Livro> liv: livros1.entrySet()) {
            System.out.println("Autor: "+ liv.getKey() + " - " + "livro: " +liv.getValue().getName() + " paginas");
        }

        System.out.println("--\tOrdem natural ou seja de A/Z--\t");
        /*
         * no caso de haver a necessidade de efetuar uma impressão na ordem natural ou seja de A/Z,
         * no caso estamos pegando pelo nome do altor do livro;
         * faremos o uso da TreeMap, passando livros 1 que foi istanciado a cima como parametro.
         * veja a baixo
         */
        Map<String, Livro> livros2 = new TreeMap<>(livros1);
        for (Map.Entry<String, Livro> liv: livros2.entrySet()) {
            System.out.println("Autor: "+ liv.getKey() + " - " + "livro: " +liv.getValue().getName() + " paginas");
        }

        System.out.println("--\tOrdem alfabetica nome dos livros\t--");
        /*
         * para efetuar esta ordenaçãom precisaremos fazer uso da interface Set, e do TreeSet, pois
         * atraves delas, conseguimos fazer um comparetor, fazendo o comparetor precisa iniciar ele veja a baixo:
         */
        Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new ComparetorNome());
        livros3.addAll(livros.entrySet());
        for (Map.Entry<String, Livro> liv: livros3) {
            System.out.println("Autor: "+ liv.getKey() + " - " + "livro: " +liv.getValue().getName());
        }
    }
}
