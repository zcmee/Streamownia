package lambda;

import java.util.function.Predicate;

/**
 *
 * @author Adam
 * Zakres Lambd -> dla zmiennych lokalnych i globalnych.
 */
public class VariableScope {
    static Book bookChip = new Book("Mały kujon", 3.99d);
    static Book bookExpensive = new Book("Mały kujon", 1234d);
    static double maxPriceStatic = 11;
    
    static void testLocalScope() {
        double maxPrice = 30.0d;
        Predicate<Book> isPriceOnion = book -> {

            maxPriceStatic = 149d;
            return book.getPrice() > maxPrice;
        };
        
        System.out.println(isPriceOnion.test(bookChip));
        System.out.println(isPriceOnion.test(bookExpensive));
    }
    
    public static void main(String[] args) {
        testLocalScope();
    }
    
}
