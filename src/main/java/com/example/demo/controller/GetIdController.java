package com.example.demo.controller;

import com.example.demo.domain.Result;
import com.example.demo.domain.enity.Admin;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admins")
public class GetIdController {

    @Autowired
    private AdminService adminService;
    @GetMapping("/{id}")
    public Result getAdmin(@PathVariable Integer id){
        Result<Admin> id1 = adminService.getId(id);
        return id1;
    }
}
