package by.itstep;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("by.itstep")
public class ApplicationConfiguration {

    @Bean
    CallService getNokiaCallService(){
        return new CallService() {
            public void call(String friendname) {
                System.out.println("Позвонить другу "+friendname);
            }
        };
    }
}
