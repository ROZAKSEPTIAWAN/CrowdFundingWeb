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

    @GetMapping("/dis")
    public String disbursment (Model model){
        return "disbursment";
    }
    
    @GetMapping("/settingsAccount")
    public String settingsA (Model model){
        return "settingsAccount";
    }

    @GetMapping("/settingsPayment")
    public String settingsP (Model model){
        return "settingsPayment";
    }

    @GetMapping("/settingsDelete")
    public String settingsD (Model model){
        return "deleteaccounts";
    }



    @GetMapping("/payment")
    public String payment (Model model){
        return "payment";
    }
    
    
}
