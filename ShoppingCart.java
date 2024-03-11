import java.util.ArrayList;

public class ShoppingCart extends itemOrder{
    ArrayList<String> cart = new ArrayList<String>();
    public void setCart(ArrayList<String> cart){this.cart = cart;}
    public ArrayList<String> getCart(){return cart;}
}
