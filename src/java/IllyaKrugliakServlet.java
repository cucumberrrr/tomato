import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/IllyaKrugliakServlet"})
public class IllyaKrugliakServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<html>\n" +
"    <head>\n" +
"        <title>My info</title>\n" +
"        <meta charset=\"utf-8\">\n" +
"        <meta name=\"keywords\" content=\"my, first, web-page\">\n" +
"        <meta name=\"description\" content=\"bla-bla-bla\">\n" +
"        <meta name=\"author\" lang=\"ru\" content=\"Ilysha Kamenь\">\n" +
"        <link rel=\"stylesheet\" href=\"style.css\">\n" +
"    </head>   \n" +
"    <body>\n" +
"        <h1>\n" +
"            Illya Krugliak\n" +
"        </h1>\n" +
"        <a href=\"anotherpage.html\">link</a><br>\n" +
"        <a href=\"https://yummyanime.club/catalog/item/moya-gerojskaya-akademiya-4\">anime</a><br>\n" +
"        <a href=\"mailto://mr.kruglik1717@gmail.com\">mr.kruglik1717@gmail.com</a>\n" +
"        <p>\n" +
"            <img src=\"IMG-INF/myphoto.jpg\" height=\"300\" alt=\"Sorry, Im off now\">\n" +
"        </p>\n" +
"        </body>\n" +
"    </html>");
       
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
