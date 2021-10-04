
package web;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment; filename=excelRespuesta.xls");
        response.setHeader("Fragma", "no-cache");
        response.setHeader("Cache-Control","no-store");
        response.setDateHeader("Expires", -1);
        
        PrintWriter out = response.getWriter();
        out.println("\t Valores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(B2:B3)");
        out.close();
    }
    
}
