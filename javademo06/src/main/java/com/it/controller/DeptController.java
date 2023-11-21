package com.it.controller;


import com.it.pojo.Dept;
import com.it.pojo.Result;
import com.it.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private DeptService deptService;
//private static Logger log = LoggerFactory.getLogger(DeptController.class)

    //@RequestMapping(value = "/depts",method = RequestMethod.GET)
    @GetMapping("")
    public Result list() {
        log.info("查询全部");
        List<Dept> depList = deptService.list();
        return Result.success(depList);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("删除部门" +id);
        deptService.delete(id);
        return Result.success();
    }

    @PostMapping("")
    public Result add(@RequestBody Dept dept){
        log.info("新增部门");
        deptService.add(dept);
        return Result.success();
    }
}
