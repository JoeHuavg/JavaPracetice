package com.it.service.impl;

import com.it.mapper.DeptMapper;
import com.it.pojo.Dept;
import com.it.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        return deptMapper.list();
        //return null;
    }

    @Override
    public void delete(Integer id) {
        deptMapper.deleteById(id);
    }
}
