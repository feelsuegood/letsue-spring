// actual folder(package in java) route: com/feelsuegood/letsue_spring
package com.feelsuegood.letsue_spring;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

// Collection of Item-related APIs
@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemRepository ItemRepository;

//    how to use without lombok
//    @Autowired
//    public ItemController(ItemRepository itemRepository) {
//        ItemRepository = itemRepository;
//    }

    @GetMapping("/list")
//    when you want to send only data
//    @ResponseBody
    String list(Model model){
//        how to use lombok
//        var result = ItemRepository.findAll();
//        System.out.print(result);
        List<Item> result = ItemRepository.findAll();
        System.out.println(result.get(0));
        System.out.println(result.get(0).title);
        var a = new ArrayList<>();
//        model.addAttribute("name of the data to deliver", "data");
        model.addAttribute("name", "sweetfirefist");
        return "list.html";
    }
}
