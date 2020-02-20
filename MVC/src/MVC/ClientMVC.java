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
public class ClientMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Client model = retriveClientFromDatabase();

        //printout client details on console
        MVC.ClientView view = new MVC.ClientView();

        ClientController controller = new ClientController(model, view);

        controller.updateView();

        //update model data
        controller.setClientName("Arturo Perez");
        controller.setClientLocation("Huntington Beach, California");
        controller.setClientOfficeNo("A7120");

        controller.updateView();
    }
   
    private static Client retriveClientFromDatabase() {
        Client client = new Client();
        client.setName("Unknown");
        client.setLocation("San Fransisco, California");
        client.setOfficeNo("U7122");
        return client;
    }

}