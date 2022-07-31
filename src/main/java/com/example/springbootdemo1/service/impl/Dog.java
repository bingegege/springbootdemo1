package com.example.springbootdemo1.service.impl;

import com.example.springbootdemo1.service.Animal;
import org.springframework.stereotype.Service;

/**
 *
 *
 * @author zhenghuan
 * @date 2022/7/30
 */
@Service
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("dog eat");
    }
}
