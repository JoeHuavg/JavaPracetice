package com.it.controller;

import com.it.pojo.Emp;
import com.it.pojo.Result;
import com.it.service.EmpService;
import com.it.service.impl.EmpServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService ;

    @RequestMapping("/listEmp")
    public Result list(){

        List<Emp> empList = empService.listEmp();

        return Result.success(empList);
    }
}
