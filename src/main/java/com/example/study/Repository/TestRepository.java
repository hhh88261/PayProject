package com.example.study.Repository;

import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository {
    void save(String test);
}
