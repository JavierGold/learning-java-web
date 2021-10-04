
package web;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")


public class CookiesServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
       boolean nuevoUsuario =true;
       
       Cookie[] cookies=request.getCookies();
       
       if(cookies!=null){
           for (Cookie c:cookies) {
               if ((c.getName().equals("visitanteRecurrente")&& c.getValue().equals("si"))) {
                   nuevoUsuario = false;
                   break;
               }
           }
       }
       
       String mensaje = null;
        if (nuevoUsuario) {
            Cookie visitantCookie = new Cookie("visitanteRecurrente","si");
            response.addCookie(visitantCookie);
            mensaje="Gracias  por visitar nuestro sitio por primera vez";
        }else{
            mensaje="Usted es cliente frecuente";
        }
        response.setContentType("text/html;charset=utf-8");
        
         PrintWriter out = response.getWriter();
         out.print(mensaje);
         out.close();
    }
    
}
