/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream.tutorialzacznijprog;

import api.SuperBook;
import java.util.List;
import java.util.function.Function;

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
    
    
}
