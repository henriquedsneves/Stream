
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 7.99, true);
        Produto p2 = new Produto("Notebook", 2998.99, false);
        Produto p3 = new Produto("Caderno", 18.99, true);
        Produto p4 = new Produto("Lapis", 5.99, true);
        Produto p5 = new Produto("Impressora", 649.50, true);
        Produto p6 = new Produto("Monitor", 989.99, false);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
        Predicate<Produto> caro = p -> p.preco >= 500;
        Predicate<Produto> promocao = p -> p.promocao == true;
        Function<Produto, String> desconto = p -> "Produto: " + p.nome + ", Preco: " + p.preco * 0.9;
        Function<Produto, String> produtoPromoonal = p -> "Produto: " + p.nome + ", Promocional: " ;
// pipeline de execução
        produtos.stream()
        .filter(caro)
        .filter(promocao)
        .map(desconto)
        .forEach(System.out::println);

        produtos.stream()
        .filter(promocao)
        .map(produtoPromoonal)
        .forEach(System.out::println);
        

        
    }

}
