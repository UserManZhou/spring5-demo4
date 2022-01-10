package com.gec.spring5.test;

import com.gec.spring5.config.SpringConfig;
import com.gec.spring5.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = (User) applicationContext.getBean("User",User.class);
        System.out.println(user);
    }
}
