/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonsample;

import org.json.simple.JSONObject;
import java.util.*;

/**
 *
 * @author apere
 */
public class JsonSample {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
                String make;
		String model;
		String year;
		int miles;
		float price;
		JSONObject obj = new JSONObject();
		
		
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Vehicle Make: ");
            make = input.next();
            
            System.out.println("Enter Vehicle Model: ");
            model = input.next();
            
            System.out.println("Enter Vehicle Build Year: ");
            year = input.next();
            
            System.out.println("Enter Vehicle Miles: ");
            miles = input.nextInt();
            
            System.out.println("Enter Vehicle Price: ");
            price = input.nextFloat();
        }
		
		
		System.out.println("Encoding JSON Object...");
		obj = JSONencode(make, model, year, miles, price);
		System.out.println(obj);
	}
	
// JSON object encoder
	private static JSONObject JSONencode(String make, String model, String year, int miles, float price) {

		JSONObject obj = new JSONObject();
		
		obj.put("Make", make);
		obj.put("Model", model);
		obj.put("Year", year);
		obj.put("Miles", miles);
		obj.put("Price", price);
		
		return obj;

	}	
}	