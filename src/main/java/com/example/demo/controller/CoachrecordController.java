package com.example.demo.controller;


import com.example.demo.domain.Result;
import com.example.demo.service.CoachrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grade")

public class CoachrecordController {
    @Autowired
    public CoachrecordService coachrecordService;

    @GetMapping("{grade}")
    public Result selectByGrade(@PathVariable String grade){
        return coachrecordService.getId(grade);
    }
}
