package com.it.service;

import com.it.pojo.Dept;
import com.it.pojo.PageBean;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {


    PageBean page(Integer page, Integer pageSize);
}
