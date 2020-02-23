package com.sqq.demo2;

/**
 * @description: Person 工厂
 * @author: shiqiangqiang
 * @createDate: 2020/2/23
 * @version: 1.0
 */
public class PersonFactory {

    /**
     * 静态工厂创建Person
     * @return
     */
    public static Persion createPerson1(){
        System.out.println("静态工厂创建Person......");
        return new Persion();
    }

    /**
     * 实例工厂创建Person
     * @return
     */
    public Persion createPerson2(){
        System.out.println("实例工厂创建Person......");
        return new Persion();
    }

}