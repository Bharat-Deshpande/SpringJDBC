package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;

@Component
public class Alien {

    @Value("21")
    private int age;
    private Laptop lap;

    private Computer com;
    public Alien() {
       // System.out.println("Alien Object created");
    }

    public Alien(int age) {
        System.out.println("Para constuctor called");
        this.age = age;
    }
    @ConstructorProperties({"age", "lap"})
    public Alien(int age, Computer com) {
        this.age = age;
        this.lap = lap;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }


    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //System.out.println("Setter called");
        this.age = age;
    }

    public void code(){
        System.out.println("Coding");
        com.compile();
    }
}
