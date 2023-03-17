package com.example.demo.config;

import com.example.demo.domain.Pet;
import com.example.demo.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration  告诉容器这是一个配置类==配置文件
 */
@Configuration
public class Myconfig {
    //给容器添加组件，方法名就是组件的id，返回类型就是组件类型，返回的值就是组件的实例
    @Bean
    public User uer01(){
        return new User("liang",19);
    }
    @Bean("kkkkk")
    public Pet pet01(){
        return new Pet("jjj",10);
    }

}
