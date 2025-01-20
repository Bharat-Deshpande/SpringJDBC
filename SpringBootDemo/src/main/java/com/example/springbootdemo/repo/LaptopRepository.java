package com.example.springbootdemo.repo;

import com.example.springbootdemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("Saved in DB");
    }
}
