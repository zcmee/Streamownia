package stream.tutorialzacznijprog;

import api.SuperBook;
import java.util.List;
import static repository.SuperBooks.getListBooks;

/**
 *
 * @author Adam Bryksy
 */

public class Streamcz1Test {
    
    public static void main(String[] args) throws Exception {
        List<SuperBook> books = getListBooks();
        StreamSuperBooks operations = new StreamSuperBooks();
        operations.showPromotedBooks(books);
        System.out.println("----------------------------------------------------");
        operations.showPromotedQuniqueOneBook(books);
        System.out.println("----------------------------------------------------");
        System.out.println(operations.getBookByPrice(129.99d, books));

    }
    
}
