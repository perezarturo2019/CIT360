
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
@WebServlet("/Editreturn")
public class Editreturn extends HttpServlet {
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int row;
    
    public void doGet(HttpServletRequest req,HttpServletResponse rsp) throws IOException,ServletException
    {
        rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        
        String eid = req.getParameter("id");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/lba","root","");
            
            pst = (PreparedStatement) con.prepareStatement("Select * from employee where id = ?");
            pst.setString(1, eid);
            rs = pst.executeQuery();
            
            while(rs.next())
                    {
                        out.print("<form action='EditServlet' method='Post'");
                        out.print("</table");
                        out.print("<tr> <td>EmpID</td> <td><input type='text' name='empid' id='empid' value= '" + rs.getString("id") + "'/> </td> </tr>");
                        out.print("<tr> <td>Firstname</td> <td><input type='text' name='fname' id='fname' value= '" + rs.getString("fname") + "'/> </td></tr>");
                        out.print("<tr> <td>Firstname</td> <td><input type='text' name='lname' id='lname' value= '" + rs.getString("lname") + "'/> </td></tr>");
                        out.print("<tr> <td colspan ='2'> <input type='submit' value= 'Edit'/> </td></tr>");
                        out.print("</table");
                        out.print("</form");
                    }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            out.println("<font color='red'> Employee Add Failed</font>");
        }
}
}
    
