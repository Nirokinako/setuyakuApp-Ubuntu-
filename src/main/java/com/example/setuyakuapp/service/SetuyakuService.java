package com.example.setuyakuapp.service;

import org.springframework.stereotype.Service;

import com.example.setuyakuapp.model.FoodRecord;
import com.example.setuyakuapp.repository.FoodMapper;

@Service
public class SetuyakuService {

    private FoodMapper foodMapper;

    public SetuyakuService(FoodMapper foodMapper) {
        this.foodMapper = foodMapper;
    }

    /**
     * 食品情報をデータベースに登録する
     */
    public FoodRecord record(FoodRecord foodRecord) {
        foodMapper.setFoodElement(foodRecord);
        return foodRecord;
    }

    /**
     * 登録情報をデータベースから取得する
     */
    public FoodRecord getFoodRecord(FoodRecord foodRecord) {
        foodMapper.getFoodElement(foodRecord);
        return foodRecord;
    }
}
