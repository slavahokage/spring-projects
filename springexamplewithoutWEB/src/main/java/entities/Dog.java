package entities;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name = "Jack";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
