package lambda;

import api.Book;

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
