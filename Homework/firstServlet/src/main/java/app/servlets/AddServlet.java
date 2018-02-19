package app.servlets;

import app.entities.User;
import app.entities.User2;
import app.model.Model;
import app.repository.UsersRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    private UsersRepository usersRepository;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.usersRepository = (UsersRepository)config.getServletContext().getAttribute("usersRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setAttribute("User2", usersRepository.findAll());
       req.getRequestDispatcher("/add.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        User2 user2 = User2.builder()
                .name("name")
                .password("password")
                .build();
        usersRepository.save(user2);
        resp.sendRedirect("/add");
    }
}
