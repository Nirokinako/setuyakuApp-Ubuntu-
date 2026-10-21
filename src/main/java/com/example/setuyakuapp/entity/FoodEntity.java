package com.example.setuyakuapp.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class FoodEntity {
    
    /**
     * ID
     */
    private Integer  id;

    /**
     * 登録日
     */
    private LocalDate recordDate;

    /**
     * 食品名
     */
    private String foodName;

    /**
     * 価格
     */
    private Integer price;

    /**
     * カロリー
     */
    private Integer cal;

}
