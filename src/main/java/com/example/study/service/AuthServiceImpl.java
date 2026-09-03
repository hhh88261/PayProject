package com.example.study.service;

import java.util.UUID;

import com.example.study.dto.PayerInfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    public String authKey(PayerInfoDto payerInfo){

        // 1. 입력 형식 검증

        // 2. 카드 정보 <-> 결제자 정보 인증

        // 3. AuthKey 생성
        UUID uuid = UUID.randomUUID();
        String authKey = uuid.toString();

        // 4. AuthKey 저장

        // 5. 반환
        return authKey;
    }
}
