package com.example.study.service;

import com.example.study.dto.PayerInfoDto;

public interface AuthService {

    String authKey(PayerInfoDto payerInfo);
}
