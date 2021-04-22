package com.hbl.sBoot;

import com.hbl.sBoot.bean.Person;
import com.hbl.sBoot.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Springboot单元测试
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootConfigApplicationTests {
    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;
    @Test
    public void contextLoads(){
        System.out.println(person);
    }
    @Test
    public void testHelloService(){
        boolean helloService = ioc.containsBean("helloService");
        System.out.println(helloService);
    }

}
