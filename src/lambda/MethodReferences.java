package lambda;

import api.Book;
import java.util.function.Function;

/**
 *
 * @author Adam Bryksy
 */


class UPPEROWNIK {
    
    static String getFirst(String element) {
        return String.valueOf(element.charAt(0));
    } 
    
}

public class MethodReferences {
    static Function<String, String> toLower = s -> s.toLowerCase();
    static Function<String, String> toLowerRef = String::toLowerCase;
    
    static Function<Book, String> firstCharNormal = b -> b.getName().toLowerCase();
    
    static Function<String, String> firstChar = UPPEROWNIK::getFirst;
    
    public static void main(String[] args) {
        BookCreator creatNew = Book::new;
        Book book1 = creatNew.create("Yondaimee", 374.23d);
        Book book2 = creatNew.create("adam", 374.23d);
        Book book3 = creatNew.create("Makrella", 374.23d);
        System.out.println("toLover:");
        System.out.println(toLower.apply("Yondaimee"));
        System.out.println(toLower.apply("adam"));
        System.out.println(toLower.apply("Makrella"));
        System.out.println("toLoverREF:");
        System.out.println(toLower.apply("Yondaimee"));
        System.out.println(toLower.apply("adam"));
        System.out.println("!!! OSTATNII ROZPIERDOLL !!!");
        
        System.out.println(firstChar.apply("Yondaimee"));
        
    }
    
}
