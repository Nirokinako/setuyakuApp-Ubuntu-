package com.example.setuyakuapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.setuyakuapp.model.FoodRecord;
import com.example.setuyakuapp.model.LoginModel;
import com.example.setuyakuapp.service.SetuyakuService;

import jakarta.validation.Valid;





@Controller
@RequestMapping("/setuyaku")
public class SetuyakuController {

    private SetuyakuService ss;
    public SetuyakuController(SetuyakuService ss) {
        this.ss = ss;
    }


    //login画面表示
    @GetMapping("/login")
    public String loginDisplay(Model model) {
        model.addAttribute("loginModel", new LoginModel());
        return "user-login";
    }

    //入力フォーム表示
    @GetMapping("/form")
    public String formDisplay(Model model) {
        model.addAttribute("foodRecord", new FoodRecord());
        return "create";
    }

    /**
     * 食品情報をデータベースに登録する
     */
    @PostMapping("/create")
    public String postMethodName(@Valid FoodRecord foodRecord, BindingResult result) {
        if(result.hasErrors()) {
            return "create";
        }
        /**
         * データベースに登録
         */
        ss.record(foodRecord);

        /**
         * 摂生奮闘記画面に遷移
         */

        return "record";
    }

    @GetMapping("/record")
    public String recordDisplay(Model model) {
        FoodRecord foodRecord = ss.getFoodRecord(new FoodRecord());
        model.addAttribute("foodRecord", foodRecord);
        return "record";
    }
    
}
