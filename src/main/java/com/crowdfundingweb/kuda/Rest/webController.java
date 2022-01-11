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
    
    
}
