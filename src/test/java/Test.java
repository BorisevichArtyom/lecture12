import by.itacademy.javaenterprise.dao.impl.UserDaoImplem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test {
    ApplicationContext xmlApplicationContext =
            new ClassPathXmlApplicationContext("spring-context.xml");
    @org.junit.jupiter.api.Test
    public void whenInstanceMethodCalled_ThenObjectExist() {
        assertTrue(xmlApplicationContext.getBean("userDao") instanceof UserDaoImplem);

    }
}
