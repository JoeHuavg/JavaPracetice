package com.it;

import com.it.mapper.EmpMapper;
import com.it.pojo.emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
class Javademo05ApplicationTests {

    @Autowired
    private EmpMapper empMapper;

    @Test
    void contextLoads() {
    }


    @Test
    public void deleteEmp(){
        int iDelte = empMapper.deleteEmp(17);
        System.out.println(iDelte);
    }

    @Test
    public void insertEmp(){
        emp emp = new emp();
        emp.setUsername("John2");
        emp.setPassword("123456");
        emp.setName("John2");
        emp.setGender((short)1);
        emp.setEntrydate(LocalDate.of(2023,11,11));
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        empMapper.insertEmp(emp);
        System.out.println(emp.getId());
    }

    @Test
    public void updateEmp(){
        emp emp = new emp();
        emp.setId(18);

        emp.setUsername("John21");
        emp.setName("John2");
        emp.setGender((short)1);
        emp.setEntrydate(LocalDate.of(2023,11,11));
        emp.setUpdateTime(LocalDateTime.now());
        emp.setDeptId(1);

        empMapper.updateEmp(emp);
        System.out.println(emp.getId());
    }


}
