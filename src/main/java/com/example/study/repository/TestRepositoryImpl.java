package com.example.study.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepositoryImpl implements TestRepository{

    @Override
    public void save(String test){
        System.out.println("저장 : " + test);
    }
}
