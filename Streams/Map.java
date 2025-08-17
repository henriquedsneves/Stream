
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class Map {
    public static void main(String[] args) {
        Ultilitarios utilitarios = new Ultilitarios();
        Consumer<String> print = System.out::print;

        List<String> nomes = Arrays.asList("Java ", "Python ", "C# ", "JavaScript\n");
        nomes.stream().map(m -> m.toUpperCase()).forEach(print);

        System.out.println("\nUsando a função maiuscula: ");
        nomes.stream()
        .map(utilitarios.maiuscula)
        .map(Ultilitarios.primeiraLetra)
        .map(utilitarios.grito).forEach(print);
            

    }
}
