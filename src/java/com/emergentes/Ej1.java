
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Ej1", urlPatterns = {"/Ej1"})
public class Ej1 extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {
          
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ej1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>ejercicio 1 edad  </h1>");
            out.println("<form action='Sa1' method='post'>");
            
            out.println("<label>Nombre: </label>");
            out.println("<input type='text' name='nombre'>");
            out.println("<br>");
            
            out.println("<label>Año de nacimiento: </label>");
            out.println("<input type='number' name='na'>");        
            out.println("<br>");
            
            out.println("<input type='submit' value='ENVIAR'>");        
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
   
    
 

}
