package lambda;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 *
 * @author Adam
 */
public  class PrimitiveTypes {
    
    public static IntStream arrayToStream() {
        System.out.println("MODENOOO");
        int[] numbers =  IntStream.generate(()-> ThreadLocalRandom.current().nextInt(100)).limit(10).toArray();
        IntStream intStream = Arrays.stream(numbers);
        intStream.forEach(System.out::println);
        return intStream;
    }
    
    
    
    public static void main(String[] args) {
//        IntStream.of(3, 4, 12, 4, 1, 88).sorted().forEach(System.out::println);
//        IntStream.generate(() -> ThreadLocalRandom.current().nextInt(42)).limit(10).forEach(System.out::println);
//        System.out.println("HERE I GOONNENEE ::::::::");
//        IntStream.iterate(3, n -> n + 4).limit(10).forEach(System.out::println);
        System.out.println("ARRAY TO STREAM");
        arrayToStream();
    }
    
}
