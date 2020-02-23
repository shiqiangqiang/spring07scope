package com.sqq.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: 作用域测试
 * @author: shiqiangqiang
 * @createDate: 2020/2/23
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = AppConfig.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ScopeTest {
    @Autowired
    private Notepad notepad1;
    @Autowired
    private Notepad notepad2;

    @Test
    public void test01(){
        System.out.println(notepad1 == notepad2);
    }

}