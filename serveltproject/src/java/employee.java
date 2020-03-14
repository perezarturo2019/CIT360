
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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
@WebServlet("/employee")

public class employee extends HttpServlet {
    Connection con;
    PreparedStatement pst;
    int row;
    
    public void doPost(HttpServletRequest req,HttpServletResponse rsp) throws IOException,ServletException
    {
        rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/lba","root","");
            String empid = req.getParameter("empid");
            String empfname = req.getParameter("fname");
            String emplname = req.getParameter("lname");
            
            pst = (PreparedStatement) con.prepareStatement("insert into employee(id,fname,lname)values(?,?,?) ");
            pst.setString(1,empid);
            pst.setString(2,empfname);
            pst.setString(3,emplname);
            row = pst.executeUpdate();
            
            out.println("<font color='blue'> Employee Added</font>");
            
                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            out.println("<font color='red'> Employee Add Failed</font>");
        }
    }
}
