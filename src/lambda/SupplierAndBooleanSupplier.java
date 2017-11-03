package lambda;

import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/**
 *
 * @author Adam Bryksy
 */

public class SupplierAndBooleanSupplier {
    private static final Supplier<Integer> supplier = () -> 12;
    //Różnica pomiędzy Predicate a BooleanSupplier to, że Predicate przyjmuję wartość
    private static final BooleanSupplier booleanGenerator = () -> {
        Random random = new Random();
        return random.nextBoolean();
    };
    
    public static void main(String[] args) {
        System.out.println("12 * " + supplier.get() + " = 144");
        System.out.println("------------------------------");
        for(int i = 0; i < 10; ++i) {
            System.out.println(true && booleanGenerator.getAsBoolean());
        }
    }
    
    
}
