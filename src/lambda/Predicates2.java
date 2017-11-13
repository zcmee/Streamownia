package lambda;

import api.Book;
import java.util.function.BiPredicate;

/**
 *
 * @author Adam Bryksy
 */

class Cock {
    private Double length;

    public Cock(Double length) {
        this.length = length;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
    
}

public class Predicates2 {
    static BiPredicate<Book, Cock> theSameSize = (book, cock) -> book.getPrice().doubleValue() == cock.getLength().doubleValue();
    
    public static void main(String[] args) {
        Book book1 = new Book("Mały kujon", 3.99d);
        Book book2 = new Book("Nintendo", 12.8d);
        Book book3 = new Book("Adam Bryksy To Geniusz zła", 2.15d);
        Cock cock1 = new Cock(2.15d);
        Cock cock2 = new Cock(3.99d);
        
        checkDependencies(book1, cock1);
        checkDependencies(book2, cock1);
        checkDependencies(book3, cock1);
        checkDependencies(book1, cock2);
        checkDependencies(book2, cock2);
        checkDependencies(book3, cock2);
        
    }
    
    public static void checkDependencies(Book book, Cock cock) {
        boolean result = theSameSize.test(book, cock);
        System.out.println(result);
        
        if(result) {
            System.out.println("Ksiązka " + book.getName() + " jest dobrej długości)");
        } else {
            System.out.println("Ksiązka " + book.getName() + " jest złej długości");
        }
    }
    
}
