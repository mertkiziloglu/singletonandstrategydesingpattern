
import DesignPattern.Product;
import DesignPattern.ShoppingApp;

import java.util.ArrayList;


public class Main {

    //--------------------------------------------------------------------------
    public static boolean checkAccessibility() {
        //  0 || 1
        Double x = (Math.floor(Math.random() * 2));

        if (x.equals(1.0))
            return true;
        else
            return false;
    }

    //---------------------------------------------------------------------------//


    public static void main(String[] args) {
        ShoppingApp app = ShoppingApp.getInstance();

        boolean connectivity = checkAccessibility();

        ArrayList<Product> products = app.doShopping(connectivity);


        //internet connective state
        if (connectivity)
            System.out.println("User is connected to Internet! Products list is fetched from Server:\n");
        else

        //database product list
            System.out.println("User isn't connected to Internet! Products list is fetched from Database:\n");

        // Products print

        for (int i = 0; i < products.size(); i++) {


            System.out.println("ID : " + products.get(i).getId());
            System.out.println("Name : " + products.get(i).getName());
            System.out.println("Price : " + products.get(i).getPrice());
            System.out.println("---------AIBÜ STORE----------");
        }
    }

}