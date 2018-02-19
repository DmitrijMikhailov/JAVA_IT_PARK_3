package app;



import app.repository.UsersRepository;
import app.repository.UsersRepositoryEntityManagerImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("main.resources.META-INF.persistence");

        UsersRepository usersRepository = new UsersRepositoryEntityManagerImpl(factory.createEntityManager());

        servletContextEvent.getServletContext().setAttribute("usersRepository", usersRepository);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}