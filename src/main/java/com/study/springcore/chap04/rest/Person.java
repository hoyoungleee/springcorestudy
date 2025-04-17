package com.study.springcore.chap04.rest;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private int age;
    private List<String> hobbies;

}
