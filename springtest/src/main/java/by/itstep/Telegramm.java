package by.itstep;

import by.itstep.Messenger;
import org.springframework.stereotype.Component;

@Component
public class Telegramm implements Messenger {
    public void sendMessage(String message) {
        System.out.println("Send via Telegramm");
        System.out.println(message);
    }
}
