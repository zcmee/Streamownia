package repository;

import api.SuperBook;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Adam
 */
public class SuperBooks {
    
    public static List<SuperBook> getListBooks() {
        List<SuperBook> listBooks = Arrays.asList(
            new SuperBook(39.99,  "Czysty kod", "twarda", false),
            new SuperBook(49.99,  "Pani jeziora", "miękka", true),
            new SuperBook(19.99,  "PHP w akcji", "miękka", false),
            new SuperBook(29.99,  "Pasja", "twarda", true),
            new SuperBook(29.99,  "Pasja", "twarda", true),
            new SuperBook(199.99, "Bajki", "twarda", true),
            new SuperBook(19.99,  "Żarty programistów", "miękka", true));
        
        SuperBook sb = new SuperBook(49.99,  "Pani jeziora", "miękka", true);
        SuperBook sb2 =new SuperBook(19.99,  "PHP w akcji", "miękka", false);
        
        return listBooks;
    }
    
}
