package com.example.demo.day2.domain;

import lombok.Data;

@Data
public class TableVo {
    private int userCode;
    private String userName;

    public TableVo() {

    }
    public TableVo(int userCode, String userName) {
        this.userCode = userCode;
        this.userName = userName;
    }
}