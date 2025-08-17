
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {
    public static void main(String[] args) {
        //Desafio: 1. Némero para binário, 
        // 2. Inverter o número binário, 
        // 3. Converter o binário invertido para inteiro

        Ultilitarios utilitarios = new Ultilitarios();
        Consumer<Object> print = System.out::println;
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7 ,8 ,9);

        
        
        //Minha Versão
        // numeros.stream()
        // .map(Integer::toBinaryString)
        // .map(invertido -> new StringBuilder(invertido).reverse().toString())
        // .map(binarioinvertido -> Integer.parseInt(binarioinvertido, 2))
        // .forEach(num -> print.accept(num.toString()));
       
        //Resposta do Desafio
        numeros.stream()
        .map(Integer::toBinaryString)
        .map(Ultilitarios.inverter)
        .map(Ultilitarios.binarioInvertido)
        .forEach(print);


    }
    
}