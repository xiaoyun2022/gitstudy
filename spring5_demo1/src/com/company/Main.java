package com.company;

import com.at.spring5.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
	// write your code here


        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        User bean = context.getBean("user",User.class);
        bean.getVipUser().toString();
        System.out.println(bean.getPassword());
        System.out.println(bean.getUsername());
    }
}
