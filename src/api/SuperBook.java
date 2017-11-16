package api;

import java.util.Objects;

/**
 *
 * @author Adam
 */
public class SuperBook extends Book{

    private String cover;
    private boolean isPromotion;

    public SuperBook(Double price, String name, String cover, boolean isPromotion) {
        super(name, price);
        this.cover = cover;
        this.isPromotion = isPromotion;
    }
    
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public boolean isIsPromotion() {
        return isPromotion;
    }

    public void setIsPromotion(boolean isPromotion) {
        this.isPromotion = isPromotion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.cover);
        hash = 97 * hash + (this.isPromotion ? 1 : 0);
        hash = 101 * hash + (Objects.hashCode(super.getName()));
        
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SuperBook other = (SuperBook) obj;
        if (!Objects.equals(this.cover, other.cover)) {
            return false;
        }
        if (this.isPromotion != other.isPromotion) {
            return false;
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "SuperBook{" + "name=" + super.getName()  + ", cover=" + cover + ", isPromotion=" + isPromotion + '}';
    }
    
}
