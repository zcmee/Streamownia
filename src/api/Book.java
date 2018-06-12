package api;

/**
 *
 * @author Adam
 */
public class Book {
    private String name;
    private Double price;
    private String cover;
    private boolean isPromotion;

    public Book(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Book(String name, Double price, String cover, boolean isPromotion) {
        this.name = name;
        this.price = price;
        this.cover = cover;
        this.isPromotion = isPromotion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", price=" + price + ", cover=" + cover + ", isPromotion=" + isPromotion + '}';
    }

}
