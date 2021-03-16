
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Sa1", urlPatterns = {"/Sa1"})
public class Sa1 extends HttpServlet {

   
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String nombre=request.getParameter("nombre");
        String a = request.getParameter("na");
        int eaño=Integer.parseInt(a);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Sa1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>se registro exitosamente </h1>");
            int r = 2021-eaño;
            out.println("<p>el nombre es "+nombre+"</p>");
            out.println("<p>la edad es "+r+"</p>");
            out.println("<br>");
            
             out.println("<a href = 'Main'>volver al main </a>");
            
            out.println("</body>");
            out.println("</html>");
        }
 
    }
}
