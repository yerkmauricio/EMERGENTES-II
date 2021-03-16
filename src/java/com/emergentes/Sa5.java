
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Sa5", urlPatterns = {"/Sa5"})
public class Sa5 extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String num1 = request.getParameter("a");
        int na=Integer.parseInt(num1);
        String num2 = request.getParameter("b");
        int nb=Integer.parseInt(num2);
        
        String oper=request.getParameter("op");
        
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Sa5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>RESULTADO DE LA OPERACIÓN</h1>");
            String suma="suma";
            String resta="resta";
            String producto="producto";
            String division="division";
            if(oper.equals(suma)){
                double sum=na+nb;
                out.println("<p>El resultado de la suma es: "+sum+"</p>");
            }else{
                if(oper.equals(resta)){
                    double res;
                    res=(double)na-nb;
                    out.println("<p>El resultado de la resta es: "+res+"</p>");
                }else{
                    if(oper.equals(producto)){
                        double pro;
                        pro=(double)na*nb;
                        out.println("<p>El resultado del Producto es: "+pro+"</p>");
                    }else{
                       if(oper.equals(division)){
                           double div;
                           div=(double)na/nb;
                           out.println("<p>El resultado de la División es: "+div+"</p>"); 
                       }
   
                }
            }
            }
 
            out.println("<br>");
            out.println("<br>");
            out.println("<a href='Main'>VOLVER AL MAIN</a>");
            out.println("</body>");
            out.println("</html>");
        }
        }

}
