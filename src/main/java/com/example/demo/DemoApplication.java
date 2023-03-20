package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *
 *
 * @SpringBootApplication   主程序类
 */
@SpringBootApplication
@MapperScan("com/example/demo/mapper")
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
/*

        //返回ioc容器
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        //获取容器中所有的组件名
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
       */
/* for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*//*

        User bean1 = run.getBean(User.class);
        User bean2 = run.getBean(User.class);
        System.out.println(bean1.getName());
        System.out.println("组件："+(bean1==bean2));
*/


    }

}
