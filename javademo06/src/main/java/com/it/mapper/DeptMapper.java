package com.it.mapper;


import com.it.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptMapper {

    @Select("Select * from dept")
    List<Dept> list();


    @Delete("Delete from dept where id=#{id}")
    void deleteById(Integer id);

    @Insert("insert into dept(name,create_time,pdate_time) value ( #{name}, #{createTime},#{updateTime})")
    void add(Dept dept);
}
