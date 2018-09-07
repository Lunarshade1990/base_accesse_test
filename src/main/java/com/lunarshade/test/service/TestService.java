package com.lunarshade.test.service;

import java.util.List;

import com.lunarshade.test.entity.Test;

public interface TestService {

    Test addTest(Test test);
    
    List<Test> getAll();
}
