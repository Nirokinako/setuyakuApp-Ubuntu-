package com.example.setuyakuapp.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
public class SignupModel {

    private Integer id;

    @NotBlank (message = "ユーザー名を入力してください")
    @Pattern(regexp="^(?=.*[A-Z])[a-zA-Z0-9_]{8,24}+$",
             message = "ユーザー名は8文字以上24文字以内で、少なくとも1つの大文字を含める必要があります")
    private String userName;

    @NotBlank (message = "パスワードを入力してください")
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
             message = "パスワードは8文字以上で、少なくとも1つの大文字、1つの小文字、1つの数字、1つの特殊文字を含める必要があります")
    private String password;
}
