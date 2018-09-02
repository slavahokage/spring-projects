package by.itstep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        User user = context.getBean(User.class);
        user.makeFun();

        Messenger messenger = context.getBean(Messenger.class);
        messenger.sendMessage("hello!");
        user.go("Minsk","SP");
        user.call("Bob");

    }
}
