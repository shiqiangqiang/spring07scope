package com.sqq.demo;

import com.sqq.demo2.Persion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: 工厂方法创建bean
 * @author: shiqiangqiang
 * @createDate: 2020/2/23
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-Factory.xml")
public class PersonFactoryTest {
    @Autowired
    private Persion person1;
    @Autowired
    private Persion person2;

    @Test
    public void test02(){
        System.out.println(person1);
        System.out.println(person2);
    }

}