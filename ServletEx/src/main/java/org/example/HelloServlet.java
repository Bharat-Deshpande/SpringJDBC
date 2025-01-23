package org.example;

import org.w3c.dom.ls.LSOutput;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/hello") //for external tomcat
public class HelloServlet extends HttpServlet {


    public void service(HttpServletRequest req, HttpServletResponse res)  {

        System.out.println("In service");
    }

}
