package com.it.service;

import com.it.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> list();

    void delete(Integer id);
}
