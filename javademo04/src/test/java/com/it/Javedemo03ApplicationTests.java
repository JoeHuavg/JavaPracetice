package com.it;

import com.it.mapper.DishMapper;
import com.it.pojo.Dish;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Javedemo03ApplicationTests {

    @Autowired
    private DishMapper dishMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void listDishTest() {
        List<Dish> dishList = dishMapper.list();
        System.out.println("Count:" + dishList.stream().count());
        dishList.stream().forEach(u -> {
            System.out.println(u.toString());
        });
    }
}
