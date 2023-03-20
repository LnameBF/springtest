package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;
/**
 * (Coachrecord)表实体类
 *
 * @author makejava
 * @since 2023-03-20 15:08:42
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("coachrecord")
public class Coachrecord  {
    @TableId
    private Integer recordid;

    private Integer teacherid;
    
    private String studentname;
    
    private String grade;
    //辅导日期
    private Date recorddate;
    //辅导开始时间
    private LocalTime starttime;
    //辅导结束时间
    private LocalTime overtime;
    //辅导内容
    private String teachdetail;
    //学生接受情况
    private String studentdetail;
    
    private String subject;



}

