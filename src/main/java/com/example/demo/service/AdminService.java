package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.domain.Result;
import com.example.demo.domain.enity.Admin;


public interface AdminService extends IService<Admin> {
     Result<Admin> getId(Integer id);
}
