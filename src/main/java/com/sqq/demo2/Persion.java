package com.sqq.demo2;

/**
 * @description: Persion类
 * @author: shiqiangqiang
 * @createDate: 2020/2/23
 * @version: 1.0
 */
public class Persion {

    private String name;

    private Integer age;

    public Persion() {
        System.out.println("Persion 无参构造方法");
    }

    public Persion(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}