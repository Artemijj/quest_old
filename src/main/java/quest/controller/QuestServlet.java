package quest.controller;

import quest.model.Quest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "QuestServlet", value = "/quest")
public class QuestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        Quest quest = (Quest) session.getAttribute("quest");
        int nextLevel = quest.getLevel() + 1;
        String answer = req.getParameter("answer");

        if (answer == null) {
            req.getRequestDispatcher("WEB-INF/quest.jsp").forward(req, resp);
        }

        quest.setNextState(answer);
        quest.setLevel(nextLevel);

        session.setAttribute("quest", quest);

        if (answer.equals("two")) {
            req.getRequestDispatcher("WEB-INF/final.jsp").forward(req, resp);
        }

        if (nextLevel > quest.getMaxLevel()) {
            req.getRequestDispatcher("WEB-INF/final.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("WEB-INF/quest.jsp").forward(req, resp);
        }
    }
}
