
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
@WebServlet("/Delete")
public class Delete extends HttpServlet {
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int row;
    
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse rsp) throws IOException,ServletException
    {
        rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        
        String empid = req.getParameter("id");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/lba","root","");
            
            
           pst = (PreparedStatement) con.prepareStatement("delete from employee where id =?");
           pst.setString(1, empid);
           
           row = pst.executeUpdate();
           
           out.println("<font color='blue'> Recods Deleted! </font>");
                      
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            out.println("<font color='red'> Employee Add Failed</font>");
        }
    
    }
    
}
