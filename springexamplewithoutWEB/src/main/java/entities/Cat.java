package entities;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name = "Bars";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
