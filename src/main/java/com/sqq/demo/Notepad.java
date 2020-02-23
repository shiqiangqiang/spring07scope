package com.sqq.demo;

/**
 * @description: 笔记本类
 * @author: shiqiangqiang
 * @createDate: 2020/2/23
 * @version: 1.0
 */
public class Notepad {

    public Notepad() {
        System.out.println("Notepad 无参构造方法......" + this.toString());
    }

    public void write(){
        System.out.println("正在写作。。。" + this.toString());
    }

    public void init(){
        System.out.println("Notepad的初始化方法" + this.toString());
    }

    public void destroy(){
        System.out.println("Notepad的销毁方法" + this.toString());
    }

}