
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apere
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int row;
    
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse rsp) throws IOException,ServletException
    {
        rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        
        String eid = req.getParameter("id");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/lba","root","");
            
           String empid = req.getParameter("empid");
           String fname = req.getParameter("fname");
           String lname = req.getParameter("lname");
            
           pst = (PreparedStatement) con.prepareStatement("update employee set fname = ?, lname = ? where id =?");
           pst.setString(1, fname);
           pst.setString(2, lname);
           pst.setString(3, empid);
           row = pst.executeUpdate();
           
           out.println("<font color='blue'> Recods Updated </font>");
                      
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            out.println("<font color='red'> Employee Add Failed</font>");
        }
    
    }
}
