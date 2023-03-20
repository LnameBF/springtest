package com.example.demo.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.domain.Result;
import com.example.demo.domain.enity.Admin;
import com.example.demo.domain.ov.AdminOv;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.service.AdminService;
import com.example.demo.util.BeanCopysUtil;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {


    @Override
    public Result getId(Integer id) {
        //根据id查询对应的用户
        Admin byId = getById(id);

        //分装ov
        AdminOv adminOv = BeanCopysUtil.BeanCopy(byId, AdminOv.class);

        Result result = Result.okResult(adminOv);
        return result;
    }
}
