
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Filter {
    public static void main(String[] args) {
      Aluno a1 = new Aluno("Ana", 7.8);
      Aluno a2 = new Aluno("Bia", 6.3); 
      Aluno a3 = new Aluno("João", 6.3); 
      Aluno a4 = new Aluno("Henrique", 6.3); 

      List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
      Predicate<Aluno> aprovado = a -> a.nota >= 7;
      Function<Aluno, String> parabenizar = a -> a.nome + " Parabens";
      
      alunos.stream()
      .filter(aprovado)
      .map(parabenizar)
      .forEach(System.out::println);
    }

}
