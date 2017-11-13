package lambda;

import api.Book;
import java.util.function.Predicate;

/**
 *
 * @author Adam
 */

public class Perdicates {
    static Predicate<Book> isBookExpensive = (book) -> book.getPrice() > 9.99;
    static Predicate<Book> isNameGood = (book) -> book.getName().startsWith("Adam");
    
    public static void main(String[] args) {
        
        Book book1 = new Book("Mały kujon", 3.99d);
        Book book2 = new Book("Nintendo", 12.8d);
        Book book3 = new Book("Adam Bryksy To Geniusz zła", 3.8d);
        Book book4 = new Book("Adam Bryksy To PipiHajzer", 113.8d);
        
        System.out.println(isBookExpensive.test(book1));
        System.out.println(isBookExpensive.test(book2));
        System.out.println(isBookExpensive.test(book3));
        System.out.println("-------------------------");
        System.out.println(isNameGood.test(book1));
        System.out.println(isNameGood.test(book2));
        System.out.println(isNameGood.test(book3));
        System.out.println("Which book is the best :");
        bestBook(book1);
        bestBook(book2);
        bestBook(book3);
        bestBook(book4);
        
    }
    
    
    private static void bestBook(Book book) {
        if(isBookExpensive.negate().and(isNameGood).test(book)) System.out.println("Książka " + book.getName() + "jest najlepsza na świecie.");
    }
    
    
}
