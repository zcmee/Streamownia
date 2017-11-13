package lambda;

import api.Book;
import java.util.function.ObjIntConsumer;

/**
 *
 * @author Adam Bryksy
 */

public class ObjIntConsumerSpecializedInterfaces{
    
    private static final ObjIntConsumer<Book> isUnderAge = (a,b) -> {
        if(a.getPrice().intValue() > b) {
            System.out.println("Ksiązka " +  a.getName() + " jest droga w chuj");
        } else {
            System.out.println("Ksiązka " +  a.getName() + " jest tania, bierz");
        }
    };
    
    public static void main(String[] args) {
        System.out.println("------------------------ ------------------------");
        ObjIntConsumer<String> simple = (a,b) -> System.out.println(a + " waży " + b + " kilogramów. Grubas Jebany Hipis Pierdolony !!!");
        simple.accept("Piotr Kowalski", 34567);
        System.out.println(" ------------------------ ------------------------");
//        Book book1 = new Book("Mały kujon", 3.99d);
//        Book book2 = new Book("Nintendo", 12.8d);
//        Book book3 = new Book("Adam Bryksy To Geniusz zła", 3.8d);
//        Book book4 = new Book("Adam Bryksy To Monstrual", 113.8d);
//        isUnderAge.accept(book1, 10);
//        isUnderAge.accept(book2, 10);
//        isUnderAge.accept(book3, 10);
//        isUnderAge.accept(book4, 10);
    }
    
}
