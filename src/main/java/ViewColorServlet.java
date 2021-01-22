import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ViewColorServlet", value = "/viewcolor")
public class ViewColorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color = request.getParameter("color");

        request.setAttribute("color", color);
        request.getRequestDispatcher("/color_app/viewcolor.jsp").forward(request,response);
    }
}