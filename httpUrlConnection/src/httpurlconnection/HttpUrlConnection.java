/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpurlconnection;
import java.net.*;
import java.io.*;
/**
 *
 * @author apere
 */
public class HttpUrlConnection {
    public static void main(String[] args) throws Exception{
        try{
            URL myUrl = new URL("http://www.costamesatransmission.com");
            HttpURLConnection conn = (HttpURLConnection) 
            myUrl.openConnection();

            System.out.println("Response: " +
                                        conn.getContentType());

            if(conn.getContentType() != null){
                        System.out.println("Congrats!! website checked");

            }
            else{
                System.out.println("Connection Error website not responding try again!! ");
            }
        }
        catch(IOException e)
        {
            System.err.format("error: \n", e);
        }
    }
}
