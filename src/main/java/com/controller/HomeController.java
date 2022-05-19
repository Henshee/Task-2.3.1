package com.controller;

import com.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @Autowired
    UserServiceImpl service;


    @RequestMapping("/users")
    public String getIndex(ModelMap model) {
        model.addAttribute("users", service.readUsers());
        return "users";
    }

    @GetMapping("/create")
    public String getCreatePage(@RequestParam("name") String name,
                                @RequestParam("lastname") String lastname,
                                @RequestParam("email") String email) {
        service.addUser(name, lastname, email);
        return "redirect:/users";
    }

    @GetMapping("/delete")
    public String create(@RequestParam("id") long id) {
        service.deleteUsersById(id);
        return "redirect:/users";
    }
    
    @GetMapping("/update")
    public String update(@RequestParam("id") long id,
                         @RequestParam("name") String name,
                         @RequestParam("lastname") String lastname,
                         @RequestParam("email") String email) {
        service.updateUser(id, name, lastname, email);
        return "redirect:/users";
    }
}
