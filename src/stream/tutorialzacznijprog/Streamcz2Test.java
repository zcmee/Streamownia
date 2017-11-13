package stream.tutorialzacznijprog;

import api.SuperBook;
import java.util.Arrays;
import java.util.List;
import static repository.SuperBooks.getListBooks;

/**
 *
 * @author Adam
 */

public class Streamcz2Test {
    
    public static void main(String[] args) throws Exception {
        List<SuperBook> books = getListBooks();
        List<SuperBook> books2 = Arrays.asList(new SuperBook(999.99,  "NieCzysty kod", "twarda", false), new SuperBook(39.99,  "Czysty kod", "twarda", false));
        List<SuperBook> books3 = Arrays.asList(new SuperBook(19.99,  "Żarty programistów", "miękka", true));
        //11
        
        MapAndFlatMap operations = new MapAndFlatMap();
        operations.showAllBooks(books);
        System.out.println("-------------------VAT:: ---------------------------");
        operations.showPricesBooksAfterTax(books);
        System.out.println("------------------- LIST OF LISTS:: ---------------------------");
        List<List<SuperBook>> listsOfListOfBook = Arrays.asList(books, books2, books3);
        
        List<SuperBook> listAllBooks = operations.chaneListOfListToSingleList(listsOfListOfBook);
        System.out.println("Liczba wszystkich ksiązek" + listAllBooks.size());
        List<SuperBook> listAllUniqueBooks = operations.changeListOfListToSingleListOfUniqueBooks(listsOfListOfBook);
        System.out.println("Liczba wszystkich ksiązek" + listAllUniqueBooks.size());
        
    }
    
}
