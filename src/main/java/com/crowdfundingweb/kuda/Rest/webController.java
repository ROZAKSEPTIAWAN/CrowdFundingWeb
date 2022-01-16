package com.crowdfundingweb.kuda.Rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller

public class webController {
    
    @GetMapping("/login")
    public String login (Model model){
        return "login";
    }

    @GetMapping("/logout")
    public String signUp (Model model){
        return "signUp";
    }
    
    @GetMapping("/forgotPass")
    public String forgotPass (Model model){
        return "forgotPass";
    }

    @GetMapping("/")
    public String index (Model model){
        return "index";
    }

    
    @GetMapping("/a")
    public String indexa (Model model){
        return "fragments/header";
    }
    
    
}
