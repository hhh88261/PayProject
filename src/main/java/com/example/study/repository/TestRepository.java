package com.example.study.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository {
    void save(String test);
}
