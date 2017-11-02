package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 *
 * 
 */
public class LambdaRepetition2 {
   
    public static void main(String[] args) {
        //BiConsumer przyjmuje dwie wartosci ale nkic nie zwrca
        BiConsumer<Double, Double> showMultiplication = (x,y) -> {
            System.out.println("mnozenie" +  (x * y));
        };
        
        BiConsumer<Double, Double> showAdditions = (x,y) -> { 
            System.out.println("dod" + (x + y));
        };
        
        //metody wykonuja sie po sobie
        showMultiplication.andThen(showAdditions) .accept(3d, 4d);
        System.out.println("======================================= ");
        BinaryOperator<String> concate = (x, y) -> x + " " + y;
        System.out.println(concate.apply("Adam", "Alina"));
        BinaryOperator<String> min = BinaryOperator.minBy(String::compareTo);
        System.out.println(min.apply("Adam", "Alina"));
        
    }
    
}
