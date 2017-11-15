package stream.tutorialzacznijprog;

import api.SuperBook;
import java.util.List;
import static repository.SuperBooks.getListBooks;

/**
 *
 * @author SKYNET
 */

public class Streamcz3Test {
    
    public static void main(String[] args) throws Exception {
        List<SuperBook> books = getListBooks();
        
        AnyMatchAllMatch operations = new AnyMatchAllMatch();
        operations.showAllBooks(books);
        System.out.println("---------------------------------------------------");
        System.out.println("Is any promotional Book " + operations.areThereAnyPromontionalBooks(books));
        
        System.out.println("all Match: " + operations.allMatch(books));
        System.out.println("noneMatch: " + operations.noneMatch(books));
        
    }
    
}
