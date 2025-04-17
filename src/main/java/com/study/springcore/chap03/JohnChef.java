package com.study.springcore.chap03;

import com.study.springcore.chap03.Chef;

public class JohnChef implements Chef {

    public void cook(){
        System.out.println("안녕하세요. John Chef 입니다.");
        System.out.println("요리를 시작합니다.");
    }
}
