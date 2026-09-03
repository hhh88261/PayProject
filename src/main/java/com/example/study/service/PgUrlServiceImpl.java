package com.example.study.service;

import java.util.UUID;

import com.example.study.dto.PgUrlDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


// PG URL 반환
// RegistId 반환

@Service
@Transactional
@RequiredArgsConstructor
public class PgUrlServiceImpl implements PgUrlService{

    public PgUrlDto pgUrl(){

        // 1. regisId 생성(랜덤한 uuid 형식)
        UUID uuid = UUID.randomUUID();
        String registId = uuid.toString();

        // 2. dto 삽입
        PgUrlDto pgUrlDto = new PgUrlDto("/pg/api/auth-key", registId);

        // 3. dto 반환
        return pgUrlDto;
    }
}
