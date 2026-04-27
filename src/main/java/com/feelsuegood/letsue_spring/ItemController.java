// actual folder(package in java) route: com/feelsuegood/letsue_spring
package com.feelsuegood.letsue_spring;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
//        System.out.println(result.get(0));
//        System.out.println(result.get(0).title);
//        var a = new ArrayList<>();
//        model.addAttribute("name of the data to deliver", "data");
        model.addAttribute("items", result);

//        var a = new Item();
//        System.out.println(a);
//        System.out.println(a.toString());
//        System.out.println(a);
        return "list.html";
    }

    @GetMapping("/write")
    String write(){
        return "write.html";
    }

//    Nouns are good when naming URLs
    @PostMapping("/add")
//    String addPost(@RequestParam(name ="title") String title, String price){
    String addPost(@RequestParam Map formData){
//        System.out.println(title);
//        System.out.println(price);
//        System.out.println(formData);

//      var test = new HashMap<>();
//      HashMap<String, Object> test = new HashMap<>();
//        Map<String, Object> test = new HashMap<>();
//        test.put("name", "Sue");
//        test.put("age", 20);
//        System.out.println(test);
//        System.out.println(test.get("name"));
        System.out.println(formData);
        var add = new Item();
//        add.title = formData.get("title").toString();
        add.setTitle(formData.get("title").toString());
//        add.price = Integer.parseInt(formData.get("price").toString());
        add.setPrice(Integer.parseInt(formData.get("price").toString()));
        System.out.println(add);
        ItemRepository.save(add);

        return "redirect:/list";
    }
}
