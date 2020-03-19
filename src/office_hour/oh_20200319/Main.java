package office_hour.oh_20200319;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Lets assume you are searching for iphone on amazon
        // many search results came in
        // i want you to store all the price element on the result page
        // in the meantime ,I want you to store all the price text into a List
        // we can use findElements and getText together
        // it will give us a List<String> that contains prices
        // but we want to get List<Double>
//        String price = "100.99" ;
//        double priceNum = Double.parseDouble(price);
//        System.out.println("priceNum = " + priceNum);
        List<String> priceLstStr =  new ArrayList<>( Arrays.asList("99.99","149.99","79.99","149.99","299.99","599.99","299.99","599.99"));
        priceLstStr.add("999.99");
        System.out.println("priceLstStr = " + priceLstStr);
        // but we want to get List<Double>
        List<Double> prices = new ArrayList<>();
        for (String eachPrice : priceLstStr) {
            prices.add(  Double.parseDouble(eachPrice)  );
        }
        System.out.println("prices in double = " + prices);
        // how do I get max price , min , average
        //  remove items above average
        //  get the unique prices
        // each and every collection implementation classes has constructor to accept another Collection object
        // to copy whatever is inside
        Set<Double> uniquePrices = new HashSet<>( prices );
        System.out.println("uniquePrices = " + uniquePrices);
        // what if we want to have a list that contains Product name , price
        // List<Product>  :
        // Try to do this task at home :  Create a product classes , 2 encapsulated fields name , price
        // toString , Constructor
        // Create List of Product , fill up this list , using actual search result you got from amazon
    }
}