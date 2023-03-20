package com.example.demo.domain.ov;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoachercordOv {

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
