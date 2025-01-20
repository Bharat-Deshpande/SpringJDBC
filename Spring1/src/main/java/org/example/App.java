package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        //JAVA BASED CONFIGURATION

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj = context.getBean("alien",Alien.class);
        //obj1.setAge(21);
        System.out.println(obj.getAge());
        obj.code();

//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();












        // XML BASED CONFIGURATION

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //OBJECTS ARE CREATED HERE ITSELF in the container
//        Alien obj1 = context.getBean( Alien.class );
//        //obj1.setAge(21);
//        System.out.println(obj1.getAge());
//        obj1.code();



//        Computer cp = context.getBean( Computer.class );
//
//        Desktop dp =  context.getBean( Desktop.class);

//
//        Alien obj2 = (Alien) context.getBean("alien" );
//       // obj2.code();
//        System.out.println(obj2.age);

    }
}
