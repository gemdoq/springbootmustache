package com.mustache.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MustacheController {
    @GetMapping(value = {"/hi", "/hi/{id}"})
    public String mustacheConWithPathVariable(Model model, @PathVariable(value = "id", required = false) String id) {
        model.addAttribute("username", "choi");
        if (id == null) {
            model.addAttribute("id", "");
        }
        return "greetings";
    }
}