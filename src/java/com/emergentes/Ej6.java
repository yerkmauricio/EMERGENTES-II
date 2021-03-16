
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//IMPORTANDO
import java.security.SecureRandom;

@WebServlet(name = "Ej6", urlPatterns = {"/Ej6"})
public class Ej6 extends HttpServlet {

   

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ej6</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> JUEGO DE DADOS</h1>");
            int sum=0;
            sum=suma();
            if(sum ==7 || sum==11){
                out.print("<p><b>La suma es: " +sum+ "   ganó  </b> </p>");
            }else{
                out.print("<p><b>La suma es: " +sum+ "   perdió  </b> </p>");
            }
            
            out.println("<br>");
            out.println("<a href='Main'>VOLVER AL Main</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    private int suma(){
    SecureRandom numAl=new SecureRandom();
    int a=numAl.nextInt(7);
    int b=numAl.nextInt(11);
    return(a+b);
}
 }

   
   

