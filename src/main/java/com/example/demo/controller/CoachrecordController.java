package com.example.demo.controller;


import com.example.demo.domain.Result;
import com.example.demo.service.CoachrecordService;
import com.example.demo.util.StateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/grade")

public class CoachrecordController {
    @Autowired
    public CoachrecordService coachrecordService;

    @GetMapping("{grade}")
    public Result selectByGrade(@PathVariable String grade){
        String message=coachrecordService.getId(grade)!=null ? "success" : "error";
        Integer code= coachrecordService.getId(grade)!=null ? StateCode.Register_code_success : StateCode.Register_code_error;
        return new Result(message,code,coachrecordService.getId(grade));
    }
}
