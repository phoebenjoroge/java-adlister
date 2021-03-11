import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "ViewAdsServlet", urlPatterns = "/ads")
public class ViewAdsServlet  extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ads adsDao = DaoFactory.getAdsDao();

        List<Ad> ads = adsDao.all();

        request.setAttribute("ads", ads);

        request.getRequestDispatcher("ads/index.jsp").forward(request, response);
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
//    }
}