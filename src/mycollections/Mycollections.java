/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycollections;

import java.util.*;

/**
 *
 * @author apere
 */
public class Mycollections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
ArrayList<String> make = new ArrayList<String>();
        make.add("Chevy");
        make.add("Chrysler");
        make.add("Ford");
        make.add("Tesla");
        
        make.remove("Tesla");

        System.out.println(make);



        LinkedList<String> model = new LinkedList<String>();
       
        model.add("Mustang"); 
        model.add("300"); 
        model.addLast("Silverado"); 
        model.addFirst("Model X"); 
        model.add(2, "F-150"); 
        model.add("2500 HD"); 
        model.add("Pacifica"); 
        System.out.println("Linked list : " + model); 
        

        HashMap<String, Integer> price = new HashMap<String, Integer>();
        price.put("Mustang", 26000);
        price.put("300", 29000);
        price.put("Silverado", 34000);
        price.put("Model X", 104000);
        System.out.println(price.get("Model X")); 


        HashSet<String> brands = new HashSet<String>();
        brands.add("Ford");
        brands.add("Chevy");
        brands.add("Chrysler");
        brands.add("Tesla");
        // duplicated element added
        brands.add("Chrysler");
        // display hashset
        System.out.println(brands); 
        System.out.println("List contains Chrysler duplicate? " + 
                           brands.contains("Chrysler")); 
        // removing hashset items
        brands.remove("Chrysler"); 
        System.out.println("Remove Chrysler and display the rest:"+brands);
        
        // iterating hashset items
        System.out.println("Iterating over brand list:"); 
        Iterator<String> i = brands.iterator(); 
        while (i.hasNext()) 
            System.out.println(i.next()); 
        
        ArrayList<String> models = new ArrayList<String>();
        models.add("Silverado");
        models.add("300");
        models.add("Model X");
        models.add("Mustang");

        Collections.sort(models);

        System.out.println(models);


        ArrayList<Integer> prices = new ArrayList<Integer>();
        prices.add(26000);
        prices.add(29000);
        prices.add(34000);
        prices.add(104000);

        Collections.sort(prices);
        System.out.println(prices);

        LinkedList<String> Makes = new LinkedList<String>();
        Makes.add("Ford");
        Makes.add("Chevy");
        Makes.add("Chrysler");
        Makes.add("Tesla");

        ListIterator iterator = Makes.listIterator(); 
        
        // list shown in forward direction
         System.out.println("Displaying list elements in forward direction : "); 
  
        while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
  
        System.out.println(); 
        // list shown in backward direction
        System.out.println("Displaying list elements in backward direction : "); 
  
        while (iterator.hasPrevious()) 
            System.out.print(iterator.previous() + " "); 
  
        System.out.println(); 
    }
    
}