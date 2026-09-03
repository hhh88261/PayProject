package com.example.study.controller;

import com.example.study.dto.BillingKeyDto;
import com.example.study.dto.PayerInfoDto;
import com.example.study.service.AuthService;
import com.example.study.service.BillingKeyService;
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
    private final BillingKeyService billingKeyService;
    /* 1. PG AuthKey 발급 요청 ->
     -- 카드 정보 및 사용자 정보 인증
     -- AuthKey 발급
     */
    @PostMapping("/auth-key")
    public String authKeyPost(PayerInfoDto payerInfo){

        return pgAuthService.authKey(payerInfo);

    }

    /* 2. PG Billing Key 요청 -> 발급/거부 -> 서버 등록 */
    @PostMapping("/billing-key")
    public BillingKeyDto billingKeyPost(String authKey){

        return billingKeyService.billingKey(authKey);

    }

    /* 3. 결제 요청 -> 결제 완료/실패 */
    @PostMapping("/payment")
    public void paymentPost(){

    }

    /* 4. Billing Key 조회 */


    /* 5. PG Billing Key 삭제 -> 삭제 완료 */

}
