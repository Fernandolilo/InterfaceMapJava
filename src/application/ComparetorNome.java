package application;

import java.util.Comparator;
import java.util.Map;

public class ComparetorNome implements Comparator<Map.Entry<String, Livro>> {

    /*
     * neste comparetor estamos comparando por nome,
     */
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        /*
         * neste caso estamos pegando o valor de L1 que é  primeiro livro,
         * e pegando L2 que é o nome do segundo livro, para fazer a sua comparação,
         * e verifica se ambos tem nomes iguais, caso seja diferente verifica as iniciais e
         * retorna ordenadamente
         */
        return l1.getValue().getName().compareToIgnoreCase(l2.getValue().getName());
    }
}
