/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author apere
 */
public class ClientView {

    /**
     *
     * @param clientName
     * @param clientLocation
     * @param clientOfficeNo
     */
    public void printClientDetails(String clientName, String clientLocation, String clientOfficeNo) {
        System.out.printf("-------------------------\n");
        System.out.println("Update Client Information: ");
        System.out.println("Name: " + clientName);
        System.out.println("Location: " + clientLocation);
        System.out.println("Office No: " + clientOfficeNo);
    }

}