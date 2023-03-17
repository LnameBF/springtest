package com.example.demo;

import com.example.demo.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 *
 *
 * @SpringBootApplication   主程序类
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //返回ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        //获取容器中所有的组件名
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
       /* for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*/
        User bean1 = run.getBean(User.class);
        User bean2 = run.getBean(User.class);
        System.out.println(bean1.getName());
        System.out.println("组件："+(bean1==bean2));
    }

}
