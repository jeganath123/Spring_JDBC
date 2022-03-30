package io.jegan.com.spring_jdbc;

import io.jegan.com.spring_jdbc.domain.dao.UserDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(SpringJdbcApplication.class, args);
        UserDAO dao = context.getBean(UserDAO.class);
        dao.printdetails();


    }

}
