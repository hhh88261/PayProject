package com.example.study.controller;

import com.example.study.dto.PayerInfoDto;
import com.example.study.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// PG사 API
@RestController
@RequiredArgsConstructor
@RequestMapping("/pg/api")
public class PgController {


    private final AuthService pgAuthService;
    /* 1. PG AuthKey 발급 요청 ->
     -- 카드 정보 및 사용자 정보 인증
     -- AuthKey 발급
     */
    @PostMapping("/auth-key")
    public String authKey(PayerInfoDto payerInfo){

        return pgAuthService.authKey(payerInfo);

    }

    /* 2. PG Billing Key 요청 -> 발급/거부 -> 서버 등록 */
    @PostMapping("/billing-key")
    public String billingKey(){

        return "billing-key-001";

    }

    /* 3. PG Billing Key 삭제 -> 삭제 완료 */

}
