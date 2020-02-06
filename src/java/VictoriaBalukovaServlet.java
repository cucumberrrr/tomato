
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/VictoriaBalukovaServlet"})
public class VictoriaBalukovaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>\n" +
"    <head>\n" +
"        <title>Наша бригада</title>\n" +
"        <meta charset=\"UTF-8\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"        <link rel=\"stylesheet\" href=\"style.css\">\n" +
"    </head>\n" +
"    <body>\n" +
"        <h2>Viktoria Balukova</h2>\n" +
"        <img src=\"IMG-INF/Vika.jpg\" height=\"400\" alt=\"Vika Balukova\">\n" +
"        <p>Hey! I`m Victoria, a first-year student of FICT and IT-93 leader. You can reach me at <a href=\"https://t.me/balukovvva\">telegram</a>  or <a href=\"https://instagram.com/balukovva?igshid=1u2he0fd8fxb3\">instagram</a>.</p>\n" +
"    </body>\n" +
"</html>");
        }
    }
    
    
    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
