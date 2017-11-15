package stream.tutorialzacznijprog;

import api.SuperBook;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author Adam Bryksy
 */
public class MapAndFlatMap {
    private final static Function<SuperBook, Double> bookWithTax = (book) -> book.getPrice() + (book.getPrice() * (23d/100d));
    
    public void showAllBooks(List<SuperBook> list) {
        list.stream().forEach(System.out::println);
    }
    
    //Ktore lepsze rozawiazanie
    public void showPricesBooksAfterTax(List<SuperBook> list) {
        list.stream()
            .map(bookWithTax)
            .forEach(System.out::println);
    }
    
    public List<SuperBook> chaneListOfListToSingleList (List<List<SuperBook>> lists) {
        return lists.stream()
                    .flatMap(lb -> lb.stream())
                    .collect(Collectors.toList());
    }
    
    public List<SuperBook> changeListOfListToSingleListOfUniqueBooks(List<List<SuperBook>> lists) {
        return lists.stream()
                    .flatMap(lb -> lb.stream())
                    .distinct()
                    .collect(Collectors.toList());
    }
    
    public List<SuperBook> isExistsExpensiveBooks(List<List<SuperBook>> lists) {
        return lists.stream()
                    .flatMap(lb -> lb.stream())
                    .distinct()
                    .collect(Collectors.toList());
    }
    
    
}
