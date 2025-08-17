
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {
        // Lista criada
        List <String> aprovados =  Arrays.asList( "Ana", "Bia", "Lia", "Gui");
        //usando o for, opção mais primitiva
        System.out.println("usando o for");
        for(int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }
        //usando o forEach, opção mediana
        System.out.println("\nusando o forEach");
        for(String nome : aprovados) {
            System.out.println(nome);
        }
        //usando o Iterator, opção mais avançada
        System.out.println("\n usando o Iterator");
        Iterator<String> iterator = aprovados.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //usando o Stream, opção mais moderna
        System.out.println("\nUsando o Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);
  

    }
}
