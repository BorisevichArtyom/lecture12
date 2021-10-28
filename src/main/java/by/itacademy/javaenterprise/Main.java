package by.itacademy.javaenterprise;

import by.itacademy.javaenterprise.dao.impl.UserDaoImplem;
import by.itacademy.javaenterprise.entity.Role;
import by.itacademy.javaenterprise.entity.User;
import by.itacademy.javaenterprise.exception.DAOException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws DAOException {
        User user = new User();
        user.setEmail("griiib@tut.by");
        user.setFirstName("Denis");
        user.setLastName("Samusenko");
        user.setPassword("Bicep");
        user.setBalanceAmount(new BigDecimal("123.44"));
        user.setRole(Role.ATHLETE);
        ApplicationContext xmlApplicationContext =
                new ClassPathXmlApplicationContext("spring-context.xml");

        UserDaoImplem daoImpl = xmlApplicationContext.getBean(UserDaoImplem.class);

        daoImpl.addUser(user);
        daoImpl.deleteUser(user);
        daoImpl.addUser(user);

        user.setFirstName("Aleksandre");

        daoImpl.updateUser(user);

        System.out.println(daoImpl.getAllUsersPagination(3, 1));



    }
}
