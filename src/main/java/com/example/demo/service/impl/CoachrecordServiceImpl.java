package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.Coachrecord;
import com.example.demo.domain.Result;
import com.example.demo.domain.ov.CoachercordOv;
import com.example.demo.mapper.CoachrecordMapper;
import com.example.demo.service.CoachrecordService;
import com.example.demo.util.BeanCopysUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoachrecordServiceImpl extends ServiceImpl<CoachrecordMapper, Coachrecord> implements CoachrecordService {

    @Autowired
    public CoachrecordMapper coachrecordMapper;

    @Override
    public Result<Coachrecord> getId(String grade) {
        //设置筛选条件，查询对应的年级
        LambdaQueryWrapper<Coachrecord> wq =new LambdaQueryWrapper<>();
        wq.eq(Coachrecord::getGrade,grade);
        List<Coachrecord> coachrecords = coachrecordMapper.selectList(wq);

        //封装Vo
        List<CoachercordOv> coachercordOvs = BeanCopysUtil.BeanCoPys(coachrecords, CoachercordOv.class);
        return Result.okResult(coachercordOvs);
    }
}
