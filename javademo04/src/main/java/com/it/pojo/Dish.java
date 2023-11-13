package com.it.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dish {

    private Integer id;
    private String name;
    private String image;


//    public Dish() {
//    }
//
//    public Dish(Integer id, String name, String image, Date create_time) {
//        this.id = id;
//        this.name = name;
//        this.image = image;
//    }
//
//    @Override
//    public String toString() {
//        return "Dish{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", image='" + image + '\'' +
//                '}';
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }

}
