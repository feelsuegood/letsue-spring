package com.feelsuegood.letsue_spring;

import jakarta.persistence.*;
import lombok.ToString;

@Entity
@ToString
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(columnDefinition = "TEXT")
    public String title;
    public Integer price;

//    ToST or use @ToString from lombok
}