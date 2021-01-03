package DesignPattern;

import java.util.ArrayList;


public class NetworkManager implements Strategy
{
    //-----------Singleton Design Start--------------------//
    private static NetworkManager obj;

    private NetworkManager(){}

    public static NetworkManager getInstance()
    {
        if (obj == null)
            obj = new NetworkManager();

        return obj;
    }
    //-----------Singleton Design Finish------------------//



    //Fetches Products List from Server
    @Override
    public ArrayList<Product> getProductsList()
    {
        ArrayList<Product> products = new ArrayList();

        products.add(new Product(1,"TSHIRT",100));
        products.add(new Product(2,"SWEATSHIRT",150));
        products.add(new Product(3,"HAT",50));

        return products;
    }

}
