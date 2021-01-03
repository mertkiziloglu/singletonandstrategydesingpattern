package DesignPattern;

import java.util.ArrayList;


public class DatabaseManager implements Strategy
{
    //-----------Singleton Design Start--------------------//
    private static DatabaseManager obj;

    private DatabaseManager(){}

    public static DatabaseManager getInstance()
    {
        if (obj == null)
            obj = new DatabaseManager();

        return obj;
    }
    //-------------Singleton Design Finish----------------//



    //Fetches Products List from Database
    @Override
    public ArrayList<Product> getProductsList()
    {


        ArrayList<Product> products = new ArrayList();

        products.add(new Product(10,"book",500));
        products.add(new Product(11,"Laptop",6000));
        products.add(new Product(12,"Mouse",70));

        return products;
    }
}
