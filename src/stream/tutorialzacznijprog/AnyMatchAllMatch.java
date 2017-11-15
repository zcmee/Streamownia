package stream.tutorialzacznijprog;

import api.SuperBook;
import java.util.List;

/**
 *
 * @author Adam Bryksy
 */
public class AnyMatchAllMatch {
    public void showAllBooks(List<SuperBook> list) {
        list.stream()
            .forEach(System.out::println);
    }
    
    public boolean areThereAnyPromontionalBooks(List<SuperBook> list) {
        return list.stream()
            .anyMatch(book -> book.isIsPromotion());
    }
    
    public boolean allMatch(List<SuperBook> list) {
        return list.stream()
            .allMatch(v -> v.getPrice() > 200);
    }
    
    public boolean noneMatch(List<SuperBook> lists) {
        return lists.stream()
                    .noneMatch(v -> v.getPrice() > 200);
    }
    
    
}
