/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acp;

import java.util.HashMap;
/**
 *
 * @author apere
 */
public class ACP {

    /**
     * @param args the command line arguments
     */
    public static HashMap<String, Controller> commands = new HashMap<String, Controller>();	
		
	public ACP() {
		
	}
	
	/* Instead of using a series of if statements a HashMap will manage delegating 
	 * the commands to the appropriate classes and returning the value back to the view layer.
	*/ 
	public static Integer handleCommand(String command, Integer firstNumber, Integer secondNumber) {
		
            commands.put("+", new Add());
            commands.put("-", new Subtract());
            commands.put("*", new Multiply());
            commands.put("/", new Divide());
            commands.put("%", new Module());

            Controller handler = commands.get(command);

            Integer math= handler.execute(firstNumber, secondNumber);
            return math;
		
	}	
    
}