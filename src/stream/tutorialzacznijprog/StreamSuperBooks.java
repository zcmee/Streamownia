package stream.tutorialzacznijprog;

import api.SuperBook;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author Adam
 */
public class StreamSuperBooks {
    private final static Supplier<Exception> bookNotFound = () -> new IllegalArgumentException("Required book bot found");
    
    
    public static void showAllBooks(List<SuperBook> list) {
        list.stream().forEach(System.out::println);
    }
    
    public void showPromotedBooks(List<SuperBook> list) {
        list.stream()
                .filter(v -> v.isIsPromotion())
                .forEach(System.out::println);
    }

    public void showPromotedQuniqueOneBook(List<SuperBook> list) {
        list.stream()
                .filter(v -> v.isIsPromotion())
                .distinct()
                .forEach(System.out::println);
    }

    public SuperBook getBookByPrice(Double price, List<SuperBook> list) throws Exception {
        return list.stream()
                .filter(v -> v.getPrice().equals(price))
                .findFirst()
                .orElseThrow(bookNotFound);
    }
    
    public void showAllPrices(List<SuperBook> list) {
        list.stream()
            .map(SuperBook::getPrice)
            .forEach(System.out::println);
    }

}
