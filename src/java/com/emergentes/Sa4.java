
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Sa4", urlPatterns = {"/Sa4"})
public class Sa4 extends HttpServlet {

   
   
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String var = request.getParameter("numero");
        int mone=Integer.parseInt(var);
        String M=request.getParameter("m");
        
           response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Sa4</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>EL CAMBIO ES  </h1>");
            
            double cambio;
            String cadena="BolDol";
            if(M.equals(cadena)){
                cambio=mone*0.14;
                out.println("<p>El cambio de "+mone+" Bs es: "+cambio+" $</p>");
                
            }else{
               cambio=mone*6.97;
                out.println("<p>El cambio de "+mone+" $ es: "+cambio+" Bs</p>");
                 
            }
         

            out.println("<br>"); 
            out.println("<a href = 'Main'>volver al main </a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   

}
