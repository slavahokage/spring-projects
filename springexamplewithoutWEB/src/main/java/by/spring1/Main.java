package by.spring1;

import Week.WeekDay;
import configs.MyConfig;
import entities.Cat;
import entities.Dog;
import entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context =
        //        new AnnotationConfigApplicationContext("entities");

        ApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Cat cat = context.getBean(Cat.class);
        Dog dog = context.getBean(Dog.class);
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);
        WeekDay weekDay = context.getBean(WeekDay.class);
        System.out.println(weekDay.getWeekDayName());
        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());
    }
}
