// actual folder(package in java) route: com/feelsuegood/letsue_spring
package com.feelsuegood.letsue_spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Collection of Item-related APIs
@Controller
public class ItemController {
    @GetMapping("/list")
//    when you want to send only data
//    @ResponseBody
    String list(Model model){
//        model.addAttribute("name of the data to deliver", "data");
        model.addAttribute("name", "sweetfirefist");
        return "list.html";
    }
}
