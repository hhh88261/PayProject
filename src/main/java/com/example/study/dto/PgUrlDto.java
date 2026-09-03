package com.example.study.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PgUrlDto {

    private String code;
    private String errorCode;
    private String registId;
    private String pgUrl;

    public String getRegistId(){
        return registId;
    }

    public String getPgUrl(){
        return pgUrl;
    }

    public PgUrlDto(String registId, String pgUrl){
        this.registId = registId;
        this.pgUrl = pgUrl;
    }

}
