
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Ultilitarios {
    public final static UnaryOperator<String> maiuscula = o -> o.toUpperCase(); 
    public final static UnaryOperator<String> primeiraLetra = o -> o.charAt(0) + ""; 
    public final static UnaryOperator<String> grito = o -> o + "!!! "; 
    public final static UnaryOperator<String> inverter = invertido ->  new StringBuilder(invertido).reverse().toString(); 
    public final static Function<String, Integer> binarioInvertido = binarioReverse -> Integer.parseInt(binarioReverse, 2);


    
}
