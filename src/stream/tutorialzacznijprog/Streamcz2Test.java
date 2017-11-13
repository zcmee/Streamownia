package stream.tutorialzacznijprog;

import api.SuperBook;
import java.util.List;
import static repository.SuperBooks.getListBooks;

/**
 *
 * @author Adam
 */

public class Streamcz2Test {
    
    public static void main(String[] args) throws Exception {
        List<SuperBook> books = getListBooks();
        MapAndFlatMap operations = new MapAndFlatMap();
        operations.showAllBooks(books);
        System.out.println("-------------------VAT:: ---------------------------");
        operations.showPricesBooksAfterTax(books);
    }
    
}
