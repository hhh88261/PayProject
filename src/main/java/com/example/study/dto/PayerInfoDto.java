package com.example.study.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PayerInfoDto {

    // 카드 정보
    private String card_no;
    private String card_expiryDate;
    private String card_master;
    private String card_bank;

    // 사용자 정보
    private String user_phone;
    private String user_name;
    private String user_birth;
}
