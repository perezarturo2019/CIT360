/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acp;
import java.util.Scanner;
/**
 *
 * @author apere
 */
public class Main {
    
public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.println("Enter a number: ");
            Integer firstNumber = Integer.parseInt(in.nextLine());
            System.out.println("Choose your mathematical operator (+, -, /, *, %): ");
            String command = in.nextLine();
            System.out.println("Enter a second number: ");
            Integer secondNumber = Integer.parseInt(in.nextLine());

            Integer handleCommand = ACP.handleCommand(command, firstNumber, secondNumber);
            System.out.print("Your mathematical expression: " + firstNumber + " " + command + " " + secondNumber + " = " + handleCommand);
                
		
	}
    
}