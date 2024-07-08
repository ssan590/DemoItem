package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

public class DemoDto {

    @Getter
    @Setter
    public static class addParam {
        private String username;
        private String title;
        private String content;
        private int price;
    }
}
