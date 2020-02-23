package com.sqq.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @description: 笔记本类（自动装配方式）
 * @author: shiqiangqiang
 * @createDate: 2020/2/23
 * @version: 1.0
 */
@Component
//@Scope(value = "prototype") // 设置为原型，每次装配的bean都不一样
//@Lazy  // 如果scope为singleton,则会变为懒加载
public class NotepadAuto {

    public NotepadAuto() {
        System.out.println("NotepadAuto 无参构造方法......" + this.toString());
    }

    public void write(){
        System.out.println("正在写作。。。" + this.toString());
    }

    /**
     * 容器初始化这个bean对象的时候自动调用init方法
     */
    @PostConstruct
    public void init(){
        System.out.println("NotepadAuto的初始化方法" + this.toString());
    }

    /**
     * 容器关闭或是销毁的时候自动调用destroy方法
     */
    @PreDestroy
    public void destroy(){
        System.out.println("NotepadAuto的销毁方法" + this.toString());
    }

}