package com.southwind.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: aispringcloud
 * @description:
 * @author: Jiakun
 * @create: 2020-02-21 12:47
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Long id;
    private String name;
    private int age;

}