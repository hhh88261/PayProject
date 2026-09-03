package com.example.study;

import com.example.study.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudyApplicationTests {

    @Autowired
    private TestService testService;

	@Test
	void transactionTest() {

        testService.createOrder();
	}

}
