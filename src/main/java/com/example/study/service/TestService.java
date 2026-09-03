package com.example.study.service;

import com.example.study.repository.TestRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {

    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    @Transactional
    public void createOrder() {

        testRepository.save("test");

    }


}
