package com.lunarshade.test.service.Impl;

import com.lunarshade.test.entity.Test;
import com.lunarshade.test.repository.TestRepository;
import com.lunarshade.test.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public Test addTest(Test test) {

        Test savedTest = testRepository.saveAndFlush(test);
        return savedTest;
    }

    @Override
    public List<Test> getAll() {
        return testRepository.findAll();
    }
}
