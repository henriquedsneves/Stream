
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        // Esse consumer serve para renomear um comando
        Consumer<String> print = System.out::print;
        Consumer<Object> println = System.out::println;

        //Nesse Stream de tipo String temos nomes, que serão impressos por uma função forEach
        Stream<String> nomes = Stream.of("Java ", "Python ", "C# ", "JavaScript\n");
        nomes.forEach(print);
        //Temos um Array simples, onde iremos executar com o Stream, na função forEach
        String[] nomes2 =  {"LUA ", "Portugol\n"};
        Stream.of(nomes2).forEach(print);
        Arrays.stream(nomes2).forEach(print);
        //Nessa função nós selecionamos o índice do Array que queremos imprimir
        Arrays.stream(nomes2, 0,2 ).forEach(println);

        //Aqui nó criamos uma lista para usar novas funções
        List <String> maisNomes = Arrays.asList("C++ ", "Ruby ", "Kotlin\n");
        maisNomes.stream().forEach(print);
        //Nesse os valores ão impressoas de forma aleatória
        maisNomes.parallelStream().forEach(print);
        //Nesse não temos valores adicionado, o Stream vai printando numeros de porma aleatória infinitamente, podendo ter um limitador
        //Stream.generate(() -> "Elemento").forEach(print);
        //Stream.iterate(0, n -> n + 1).forEach(println);

    }
}
