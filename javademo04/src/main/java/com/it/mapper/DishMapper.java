package com.it.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.it.pojo.Dish;

import java.util.List;

@Mapper
public interface DishMapper {
    //查询数据
    @Select("select id,name,image from dish")
    public List<Dish> list();

}
