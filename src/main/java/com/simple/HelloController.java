package com.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Suresh kumar on 04-05-2017.
 */
@Controller
public class HelloController {

    @GetMapping("/home")
    public String renderPage() {
//        return new ModelAndView("templates/content/`  ogin/hello.html");
        return "content/login/home";
    }


    @PostMapping("/hello")
    public String renderPageForHelloWorld() {
//        return new ModelAndView("templates/content/`  ogin/hello.html");
        return "content/login/hello";
    }


}
