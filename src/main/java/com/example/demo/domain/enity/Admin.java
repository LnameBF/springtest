package com.example.demo.domain.enity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * (Admin)表实体类
 *
 * @author makejava
 * @since 2023-03-20 09:57:07
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("admin")
public class Admin  {
    @TableId
    private Integer adminid;

    
    private String password;



}

