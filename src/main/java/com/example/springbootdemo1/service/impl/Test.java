package com.example.springbootdemo1.service.impl;

import com.example.springbootdemo1.service.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 *
 * @author zhenghuan
 * @date 2022/7/30
 */
@Service
public class Test {

    @Autowired
    @Qualifier("dog")
    private Animal mAnimal;
}
