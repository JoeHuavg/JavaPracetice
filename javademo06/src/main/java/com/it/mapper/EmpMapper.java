package com.it.mapper;

import com.it.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {

    @Select("Select * from emp")
    public List<Emp> list();
}
