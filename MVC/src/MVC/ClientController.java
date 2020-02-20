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
public class ClientController {
   private final Client model;
    private final MVC.ClientView view;

    /**
     *
     * @param model
     * @param view
     */
    public ClientController(Client model, MVC.ClientView view) {
        this.model = model;
        this.view = view;
    }
    
    /**
     *
     * @param name
     */
    public void setClientName(String name) {
        model.setName(name);
    }

    /**
     *
     * @return
     */
    public String getClientName() {
        return model.getName();
    }

    /**
     *
     * @param location
     */
    public void setClientLocation(String location) {
        model.setLocation(location);
    }

    /**
     *
     * @return
     */
    public String getClientLocation() {
        return model.getLocation();
    }

    /**
     *
     * @param officeno
     */
    public void setClientOfficeNo(String officeno) {
        model.setOfficeNo(officeno);
    }

    /**
     *
     * @return
     */
    public String getClientOfficeNo() {
        return model.getOfficeNo();
    }

    /**
     *
     */
    public void updateView() {
        view.printClientDetails(model.getName(), model.getLocation(), model.getOfficeNo());
    }

}