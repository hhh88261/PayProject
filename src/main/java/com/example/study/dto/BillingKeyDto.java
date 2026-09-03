package com.example.study.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BillingKeyDto {

    private int code;
    private String errorCode;
    private String billingKey;
    private String checkOutUrl;



    public BillingKeyDto(int code, String errorCode, String billingKey, String checkOutUrl){
        this.code = code;
        this.errorCode = errorCode;
        this.billingKey = billingKey;
        this.checkOutUrl = checkOutUrl;
    }

}
