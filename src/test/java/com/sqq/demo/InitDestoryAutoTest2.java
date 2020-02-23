package com.sqq.demo;

import config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: 初始化和销毁方法 自动装配方式的测试
 * @author: shiqiangqiang
 * @createDate: 2020/2/23
 * @version: 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class InitDestoryAutoTest2 {

//    @Autowired
//    private NotepadAuto notepadAuto1;
//    @Autowired
//    private NotepadAuto notepadAuto2;

    @Test
    public void test01(){
//        notepadAuto1.write();
//        notepadAuto2.write();
    }

}