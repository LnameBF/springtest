package com.example.demo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.domain.Coachrecord;
import com.example.demo.domain.Result;

public interface CoachrecordService extends IService<Coachrecord> {
    Result<Coachrecord> getId(String grand);

}
