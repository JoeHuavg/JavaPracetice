package com.it.service.impl;

import com.it.dao.EmpDao;
import com.it.dao.impl.EmpDaoA;
import com.it.pojo.Emp;
import com.it.service.EmpService;

import java.util.List;

public class EmpServiceA implements EmpService {

    private EmpDao empDao = new EmpDaoA();
    @Override
    public List<Emp> listEmp() {

        List<Emp> empList = empDao.listEmp();
        empList.stream().forEach(emp -> {
            String gender = emp.getGender();
            if ("1".equals(gender)) {
                emp.setGender("男");
            } else if ("2".equals(gender)) {
                emp.setGender("女");
            }

            String job = emp.getJob();
            if ("1".equals(job)) {
                emp.setJob("讲师");
            } else if ("2".equals(job)) {
                emp.setJob("班主任");
            } else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }
        });

        return empList;

    }
}
