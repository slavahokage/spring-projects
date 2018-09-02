package by.itstep;

import org.springframework.stereotype.Component;

@Component
public interface Messenger {
    void sendMessage(String message);
}
