package lambda;

import java.util.function.Function;

/**
 *
 * @author Adam Bryksy
 */
public class MethodReferences {
    static Function<String, String> toLower = s -> s.toLowerCase();
    static Function<String, String> toLowerRef = String::toLowerCase;
    
//    static Function<Book, String> toLowerBook = Book::getName;
    
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
    }
    
}
