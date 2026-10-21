package com.example.setuyakuapp.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
public class FoodRecord {

    private Integer id;

    @NotNull(message = "記録日を入力してください")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate recordDate;

    @NotBlank (message = "食べ物を入力してください")
    private String food;
    @NotNull(message = "価格を入力してください")
    @Size (min = 1,max = 20, message = "価格は1以上20以下である必要があります")
    private Integer price;
    @NotNull(message = "カロリーを入力してください")
    @Size (min = 1, max = 20, message = "カロリーは1以上20以下である必要があります")
    private Integer cal;
}
