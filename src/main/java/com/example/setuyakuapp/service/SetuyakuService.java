package com.example.setuyakuapp.service;

import java.util.List;

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
    public FoodRecord setFoodElement(FoodRecord foodRecord) {
        foodMapper.setFoodElement(foodRecord);
        return foodRecord;
    }

    /**
     * 登録情報をデータベースから取得する
     */
    public List<FoodRecord> getFoodRecord(FoodRecord foodRecord) {
        return foodMapper.getFoodRecord(foodRecord);
    }
}
