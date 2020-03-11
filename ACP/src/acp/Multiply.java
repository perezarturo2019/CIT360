/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acp;

/**
 *
 * @author apere
 */
public class Multiply extends Controller {

    @Override
    public int execute(Integer firstNumber, Integer secondNumber){
        Integer multiply = firstNumber * secondNumber;
        return multiply;
    }
}