

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RobertDunbsonServelet extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Наша бригада</title>");                   
            
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<link rel=\"stylesheet\" href=\"style.css\">\n");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Robert Dubson</h2>");
            out.println("<img src=\"IMG-INF/photo_2019-08-28_13-23-30.jpg\" height = \"400\" alt=\"RobertDubson\">");
            out.println("<p>Hello! My name is Robert Dubson and I am 18 yeear-old KPI student.\n" +
"        I like listening to old pop and  classic rock music, I also like classic literature and art-house cinema.</p>");
            out.println("</body>");
            
            out.println("</html>");
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
