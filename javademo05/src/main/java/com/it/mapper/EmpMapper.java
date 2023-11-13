package com.it.mapper;

import org.apache.ibatis.annotations.*;
import com.it.pojo.emp;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    @Delete("delete from emp where id = #{id} ")
    public int deleteEmp(Integer id);


    @Options(keyProperty = "id", useGeneratedKeys = true)
    @Insert("insert into emp(username, name,gender, image, job, entrydate, dept_id,create_time, update_time)" +
            " values ( #{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void insertEmp(emp emp);

    @Update("update emp set username = #{username}, name = #{name}, gender = #{gender}, image = #{image}, " +
            " job = #{job}, entrydate = #{entrydate}, dept_id = #{deptId}, update_time = #{updateTime} where id = #{id}")
    public void updateEmp(emp emp);

    //    @Results({
//            @Result(column = "dept_id", property = "deptid"),
//    })
    @Select("SELECT * from emp where id = #{id}")
    public emp getById(Integer id);

    @Select("select * from emp where name like concat('%',#{name},'%') and gender = #{gender} and " +
            "entrydate between #{begin} and #{end} order by update_time desc ")
    public List<emp> list(String name, Short gender, LocalDate begin, LocalDate end);
}
