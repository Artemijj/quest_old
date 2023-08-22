package quest.controller;

import quest.model.Quest;

import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "StartServlet", value = "/start")
public class StartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        Quest quest = (Quest) session.getAttribute("quest");
        String ipAddress = req.getRemoteAddr();
        String user = req.getParameter("user");
        if (quest == null) {
            quest = new Quest();
            quest.setUser(user != null? user : "");
            quest.setIpAddress(ipAddress);
            quest.setNumberGames(1);
        } else if (user.equals(quest.getUser()) && !user.equals("")) {
//            int numberGames = quest.getNumberGames();
            quest.setNumberGames(quest.getNumberGames() + 1);
        } else if (!user.equals(quest.getUser()) || user.equals("")) {
            quest.setUser(user != null? user : "");
            quest.setIpAddress(ipAddress);
            quest.setNumberGames(1);
        }

        session.setAttribute("quest", quest);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/quest.jsp");
        requestDispatcher.forward(req, resp);
    }
}
