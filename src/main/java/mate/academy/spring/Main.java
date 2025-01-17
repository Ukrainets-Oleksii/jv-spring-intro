package mate.academy.spring;

import java.util.List;
import mate.academy.spring.config.AppConfig;
import mate.academy.spring.model.User;
import mate.academy.spring.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        User user = new User();
        user.setName("Bob");
        user.setAge(20);
        User userBeforeAdd = userService.add(user);
        System.out.println(userBeforeAdd);

        List<User> allUsers = userService.getAll();
        allUsers.forEach(System.out::println);
    }
}
