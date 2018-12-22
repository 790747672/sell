package com.yeafel;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by kangyifan on 2018/7/25 9:22
 */
@RunWith(SpringRunner.class)
@Slf4j
public class LoggerTest {

//    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);  //采用上面的@Slf4j注解即可达到效果

    @Test
    public void test1(){
//        logger.info("debug.....");
//        logger.info("info......");
//        logger.info("error......");

        String name = "yeafel";
        String password = "123456";
        log.info("debug.....");
        log.info("name: " + name + " password: " + password);
        log.info("name: {}, password:{}",name,password);
        log.info("error......");
    }
}
