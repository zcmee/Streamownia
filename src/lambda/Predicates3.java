package lambda;

/**
 *
 * @author Adam
 */
public class Predicates3 {
    
    public static void main(String[] args) {
        Predicate3ElementsInterface superPredicate = (a,b,c) -> (a == b && b == c);
        
        System.out.println(superPredicate.test(3, 4, 5));
        System.out.println(superPredicate.test(1, 4, 1));
        System.out.println(superPredicate.test(1, 1, 1));
        
    }
    
    
    
}
