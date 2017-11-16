package lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;


/**
 *
 * @author Adam
 */


public class LambdaRepetition {
    private static final Map<String, InterfaceCalculation> operations;
    static {
        operations = new HashMap<>();
        operations.put("+", (a, b)-> a + b);
        operations.put("-", (a, b)-> { return a - b;});
        operations.put("*", (a, b)-> a * b);
        InterfaceCalculation divide = (a, b) -> a / b;
        operations.put("/", divide);
    }
    
    public static void main(String[] args) {
        System.out.println("10+3 " +  calculate("+", 10, 3));
        System.out.println("10-3 " +  calculate("-", 10, 3));
        System.out.println("10*3 " +  calculate("*", 10, 3));
        System.out.println("10/3 " +  calculate("/", 10, 3));
        
        BiFunction<Integer, Integer, Number> minus = (a,b) -> {
            System.out.println("Yondaimee Homkaghe ::");
            return a - b;
        };
        System.out.println(" --------------------- ");
        System.out.println("BiFunctionMinus minus ::: 10-12 =" + genericCalculate(minus, 10, 12));
        System.out.println("Podwójne mnożenie ::: 2*5*3=" + genericCalculate((a,b) -> 2 * a * b , 5, 3));
    }
    
    private static Number calculate(String operator, int a, int b) {
        return operations.get(operator).calculation(a, b);
    }
    
    private static Number genericCalculate(BiFunction<Integer, Integer, Number> operation, int a, int b) {
        return operation.apply(a, b).doubleValue();
    } 
    
}
