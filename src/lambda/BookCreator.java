package lambda;

/**
 *
 * @author Adam
 */

@FunctionalInterface
public interface BookCreator {

    /**
     *
     * @param name
     * @param price
     * @return
     */
    public Book create(String name, Double price);
}
