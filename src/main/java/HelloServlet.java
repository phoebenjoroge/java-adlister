import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String hello = request.getParameter("said");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (hello != null) {
            out.printf("<h1>User said: %s</h1>", hello);
        } else {
            out.println("<h1>Hello World!! </h1>");
        }
    }
}