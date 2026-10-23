package com.example.setuyakuapp.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
public class FoodRecord {

    private Long id;

    @NotNull(message = "記録日を入力してください")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate recordDate;

    @NotBlank (message = "食べ物を入力してください")
    private String foodName;
    @NotNull(message = "価格を入力してください")
    @Min(value = 1, message = "価格は1以上である必要があります")
    private Integer price;
    @NotNull(message = "カロリーを入力してください")
    @Min(value = 1, message = "カロリーは1以上である必要があります")
    private Integer cal;
}
