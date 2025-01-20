package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("com2")
@Primary
@Scope("prototype")
public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop constructor created");
    }

    public void compile(){
        System.out.println("Compiling using desktop");
    }
}
