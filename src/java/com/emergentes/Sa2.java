
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Sa2", urlPatterns = {"/Sa2"})
public class Sa2 extends HttpServlet 
{
  
  
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String var = request.getParameter("numero");
        int fac=Integer.parseInt(var);
        
          response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Sa2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EL FACTORIAL</h1>");
            int factorial=1;
            for(int i=1; i<=fac; i++){
            factorial=factorial*i;
            }
            out.println("<p>El factorial de " +fac+" es: " +factorial+"</p>");
            out.println("<br>");
            
            out.println("<a href = 'Main'>volver al main </a>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

   
}
