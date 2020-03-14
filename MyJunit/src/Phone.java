/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apere
 */
public class Phone {
    int x;
    int y;
    
    public Phone(int x, int y) {
        this.x = x;
        this.y = y;
    }
    boolean isPhoneInMyRoom(){
        return (this.x < 0 || this.y < 0);
        
    }
    
    void moveBy(int x, int y) {
        this.x+=x;
        this.y+=y;
    }
    
    double distance(int x, int y) {
        int xdiff = this.x -x;
        int ydiff = this.y -y;
       double sumsq = xdiff*xdiff + ydiff*ydiff;
       return Math.sqrt(sumsq);
       
    }
    
}
