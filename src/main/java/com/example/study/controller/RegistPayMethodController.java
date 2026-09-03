package com.example.study.controller;


import com.example.study.dto.PgUrlDto;
import com.example.study.service.PgUrlService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 신규 결제 수단 등록
@RestController
@RequiredArgsConstructor
@RequestMapping("/new/api")
public class RegistPayMethodController {

    private final PgUrlService pgUrlService;

    /* 1. 결제수단 등록 요청-> RegistId 발급 -> PG URL 반환 */
    @GetMapping("/1")
    public PgUrlDto getPgUrl(){

        return pgUrlService.pgUrl();

    }

    /* 3. 결제 수단 저장 -> Billing Key 및 기타 정보 등록 -> RegistId 삭제 및 AuthKey 만료 */

}