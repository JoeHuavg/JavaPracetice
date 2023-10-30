package com.it.dao.impl;

import com.it.dao.EmpDao;
import com.it.pojo.Emp;
import com.it.utils.XmlParserUtils;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //将当前对象交给IOC容器管理,成为IOC容器的bean
public class EmpDaoA implements EmpDao {
    @Override
    public List<Emp> listEmp() {
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);
        return empList;
    }
}
