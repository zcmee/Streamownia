package stream.tutorialzacznijprog;

import api.SuperBook;
import java.util.List;
import static repository.SuperBooks.getListBooks;

/**
 *
 * @author Adam
 */
public class Streamcz4Test {
    
    
    public static void main(String[] args) {
        List<SuperBook> books = getListBooks();
        MyOptional optional = new MyOptional();
        optional.showAllBooks(books);
        System.out.println("--------- Ksiązka zaczynająca się na P ------------------------");
        System.out.println(optional.findFirstBookByFirstCharacter(books, "P"));
        System.out.println("--------- Ksiązka zaczynająca się na R ------------------------");
        System.out.println(optional.findFirstBookByFirstCharacter(books, "R"));
        System.out.println("--------- Książka po nieistniejącej cenie ------------------------");
        System.out.println(optional.findFirstBookByPrice(books, 8475.34));
    }
}

//SuperBook{name=Czysty kod, cover=twarda, isPromotion=false}
//SuperBook{name=Pani jeziora, cover=miękka, isPromotion=true}
//SuperBook{name=PHP w akcji, cover=miękka, isPromotion=false}
//SuperBook{name=Pasja, cover=twarda, isPromotion=true}
//SuperBook{name=Pasja, cover=twarda, isPromotion=true}
//SuperBook{name=Bajki, cover=twarda, isPromotion=true}
//SuperBook{name=Vat zaPan Brat, cover=twarda, isPromotion=true}
//SuperBook{name=Żarty programistów, cover=miękka, isPromotion=true}