package org.example.springbootweb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.parsing.QualifierEntry;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    // Servlet way of doing things
//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session) {
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int result = num1 + num2;
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }

//    @RequestMapping("add")
//    public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv) {
//        int result = num + num2;
//        mv.addObject("result", result);
//        mv.setViewName("result");
//        return mv;
//    }

    @RequestMapping("addAlien")
    public String addalien( Alien alien) {

        return "result";
    }



}
