
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Ej4", urlPatterns = {"/Ej4"})
public class Ej4 extends HttpServlet {
  
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ej4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>CAMBIO  DE BOLVIANO A DOLLAR </h1>");
            
            out.println("<form action='Sa4' method='post'>");
            out.println("<label>Introduzca Monto: </label>");
            
            out.println("<input type='number' name='numero'>");           
            out.println("<br>");
            
            out.println("<label>Seleccione tipo de cambio: ");
            out.println("<select name='m' id='pa'>");
            
    	    out.println("<option value='BolDol'>Boliviano a Dolar</option>");
    	    out.println("<option value='DolBol'>Dolar a Boliviano</option>");
    	    out.println("</select>");
            out.println("<br>");
            
            out.println("<input type='submit' value='CAMBIAR'>");
            out.println("</form>");
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='Main'>VOLVER AL Main</a>");
            out.println("</body>");
            out.println("</html>");
    }

   }
}
