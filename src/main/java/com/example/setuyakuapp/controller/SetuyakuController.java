package com.example.setuyakuapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.setuyakuapp.model.LoginModel;
import com.example.setuyakuapp.model.SetuyakuModel;



@Controller
@RequestMapping("/setuyaku")
public class SetuyakuController {

    //login画面表示
    @GetMapping("/login")
    public String loginDisplay(Model model) {
        model.addAttribute("loginModel", new LoginModel());
        return "user-login";
    }

    //入力フォーム表示
    @GetMapping("/form")
    public String formDisplay(Model model) {
        model.addAttribute("setuyakuModel", new SetuyakuModel());
        return "create";
    }
    
    
}
