package com.example.springbootdemo1.service;

/**
 *
 *
 * @author zhenghuan
 * @date 2022/2/10
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("1111");
        System.out.println(1&1);
        System.out.println(false&print());
        System.out.println(true|print());
    }
    static boolean print(){
        System.out.println(111);
        return true;
    }
}
