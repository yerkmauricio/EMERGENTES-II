
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Main", urlPatterns = {"/Main"})
public class Main extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Main</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>ESTE MENU DE OPCIONES </h1>");
            out.println("<h2>Seleccione una opción: </h2>");
            out.println("<a href='Ej1'>Ejercicio 1</a>");
            out.println("<br>");
            out.println("<a href='Ej2'>Ejercicio 2</a>");
            out.println("<br>");
            out.println("<a href='Ej3'>Ejercicio 3</a>");
            out.println("<br>");
            out.println("<a href='Ej4'>Ejercicio 4</a>");
            out.println("<br>");
            out.println("<a href='Ej5'>Ejercicio 5</a>");
            out.println("<br>");
            out.println("<a href='Ej6'>Ejercicio 6</a>");
            out.println("<br>");
            out.println("<a href='Ej7'>Ejercicio 7</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
