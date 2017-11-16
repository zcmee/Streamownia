package stream.tutorialzacznijprog;

import api.SuperBook;
import java.util.List;

/**
 *
 * @author Adam
 */
public class MyOptional {
    
    public void showAllBooks(List<SuperBook> list) {
        list.stream()
            .forEach(System.out::println);
    }
    
    public SuperBook findFirstBookByFirstCharacter(List<SuperBook> list, String character) {
        return list.stream()
                .filter(v -> v.getName().startsWith(character))
                .findFirst()
                .orElse(new SuperBook(39.99,  "!!!Na końcu spuer świata!!!", "TRYTONNN", false));
    }
    
    public SuperBook findFirstBookByPrice(List<SuperBook> list, double price) {
        return list.stream()
                .filter(v -> v.getPrice().equals(price))
                .findFirst()
                .orElseThrow( () -> new IllegalArgumentException("Book for this price, not exists"));
    }
    
}
