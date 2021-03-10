import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "viewcolor", urlPatterns = "/viewcolor")
public class viewColor extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String favoriteColor = request.getParameter("favorite_color");
        request.setAttribute("favoriteColor", favoriteColor);
        request.getRequestDispatcher("/viewcolor.jsp").forward(request,response);

    }
}
