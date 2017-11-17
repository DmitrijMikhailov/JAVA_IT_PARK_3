package com.company;
import com.company.dao.HumanDao;
import com.company.dao.jdbc.template.HumansJdbcTemplateDaoImpl;
import com.company.models.Human;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
public class Main {

    public static void main(String[] args) {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setUsername("postgres");
	dataSource.setPassword("gfnhbrldtqy");
	dataSource.setUrl("jdbc:postgresql://localhost:5432/homework_task_14");
		HumanDao humansDao = new HumansJdbcTemplateDaoImpl(dataSource);
		Human avraam = new Human("Авраам", 75, "Израиль");

		System.out.println(avraam);
		humansDao.save(avraam);
		System.out.println(avraam);
    }
}
