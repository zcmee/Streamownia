package lambda;

import api.Book;
import java.util.function.Predicate;

/**
 *
 * @author Adam
 * Zakres Lambd -> dla zmiennych lokalnych i globalnych.
 */
public class VariableScope {
    static Book bookChip = new Book("Mały kujon", 3.99d);
    static Book bookExpensive = new Book("Mały kujon", 1234d);
    double maxPriceGlobal = 11;
    
    void testLocalScope() {
        double maxPriceLocale = 30.0d;
        Predicate<Book> isPriceOnion = book -> {
//            maxPriceLocale = 13.34d;
            maxPriceGlobal = 149d;
            
            return book.getPrice() > maxPriceGlobal;
        };
        
        System.out.println(isPriceOnion.test(bookChip));
        System.out.println(isPriceOnion.test(bookExpensive));
    }
    
    public static void main(String[] args) {
        VariableScope vs = new VariableScope();
        vs.testLocalScope();
    }
    
}
