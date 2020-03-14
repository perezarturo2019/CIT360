
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
@WebServlet("/viewemployee")

public class viewemployee extends HttpServlet {
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    int row;
    
    public void doGet(HttpServletRequest req,HttpServletResponse rsp) throws IOException,ServletException
    {
        rsp.setContentType("text/html");
        PrintWriter out = rsp.getWriter();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/lba","root","");
            
            String sql;
            sql = "select * from employee";
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            
            out.print("<table cellspacing='0' width='350px' border='1'>");
            out.print("<tr>");
            out.print("<td> EmpID </td>");
            out.print("<td> Firstname </td>");
            out.print("<td> Lastname </td>");
            out.print("<td> Edit </td>");
            out.print("<td> Delete </td>");
            out.print("</tr>");
            
            while(rs.next())
            {
                out.print("<tr>");
                out.print("<td>" +rs.getString("id") + "</td>");
                out.print("<td>" +rs.getString("fname") + "</td>");
                out.print("<td>" +rs.getString("lname") + "</td>");
                out.print("<td>" + "<a href='Editreturn?id=" + rs.getString("id") + "'> Edit </a>" + "</td>");
                out.print("<td>" + "<a href='Delete?id=" + rs.getString("id") + "'> Delete </a>" + "</td>");
                out.print("</tr>");
            }
            out.print("</table>");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            out.println("<font color='red'> Employee Add Failed</font>");
        }
}
}