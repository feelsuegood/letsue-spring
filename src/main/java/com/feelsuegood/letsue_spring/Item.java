package com.feelsuegood.letsue_spring;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(columnDefinition = "TEXT")
    private String title;
    private Integer price;

//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setPrice(Integer price) {
//        this.price = price;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public Integer getPrice() {
//        return price;
//    }

    //    ToST or use @ToString from lombok
}