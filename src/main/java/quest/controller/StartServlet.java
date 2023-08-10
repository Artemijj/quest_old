package quest.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;

@WebServlet(name = "StartServlet", value = "/start")
public class StartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        getServletContext().getRequestDispatcher("/quest.jsp").forward(req, resp);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/quest.jsp");
        requestDispatcher.forward(req, resp);

//        req.getSession().invalidate();
//        resp.sendRedirect("/quest.jsp");
    }

}
