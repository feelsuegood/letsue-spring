package com.feelsuegood.letsue_spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

// @Controller: dark magic of spring
@Controller
public class BasicController {
    @GetMapping("/")
    String hello(){
        return "index.html";
    }

    @GetMapping("/about")
    @ResponseBody
    String about(){
        return "About page";
    }

    @GetMapping("/mypage")
    @ResponseBody
    String mypage(){
        return "My page";
    }

    @GetMapping("/date")
    @ResponseBody
    String date(){
        Date today = new Date();
        SimpleDateFormat formatMethod = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
        return formatMethod.format(today);
    }
}
