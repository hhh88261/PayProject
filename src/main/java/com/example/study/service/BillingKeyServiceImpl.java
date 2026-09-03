package com.example.study.service;

import com.example.study.dto.BillingKeyDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
@RequiredArgsConstructor
public class BillingKeyServiceImpl implements BillingKeyService {


    public BillingKeyDto billingKey(String authKey){

        // 1. Auth Key 검증

        // 2. Billing Key 생성
        UUID uuid = UUID.randomUUID();
        String billingKey = uuid.toString();

        // 3. Billing Key 저장

        // 4. DTO 생성
        BillingKeyDto billingKeyDto = new BillingKeyDto(0, "example-errorCode", billingKey, "https://example.com");

        // 5. 반환
        return billingKeyDto;
    }
}
