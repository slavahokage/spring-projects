package by.itstep;

import org.springframework.stereotype.Component;

@Component
public interface MapsService {
    void findRoute(String a, String b);
}
