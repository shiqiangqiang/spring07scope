package com.sqq.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: 初始化和销毁方法测试
 * @author: shiqiangqiang
 * @createDate: 2020/2/23
 * @version: 1.0
 */
public class InitDestoryTest2 {

    @Test
    public void test01(){
        System.out.println("容器初始化之前。。。");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Notepad notepad2 = (Notepad) context.getBean("notepad2");
        notepad2.write();
        // 容器销毁
//        context.destroy();
        // close方法会包含destory方法
        context.close();
    }

}