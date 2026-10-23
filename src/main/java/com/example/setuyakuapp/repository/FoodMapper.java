package com.example.setuyakuapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.setuyakuapp.model.FoodRecord;

@Mapper 
public interface FoodMapper {
    /**
     * 食品情報をデータベースに登録する
     */
    void setFoodElement(FoodRecord foodRecord);

    /**
     * 登録情報ほデータベースから取得する
     */
    List<FoodRecord> getFoodRecord(FoodRecord foodRecord);
}
