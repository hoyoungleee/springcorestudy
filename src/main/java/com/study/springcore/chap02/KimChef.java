package com.study.springcore.chap02;

import com.study.springcore.chap01.Chef;

public class KimChef implements Chef {

    public void cook(){
        System.out.println("안녕하세요. Kim Chef 입니다.");
        System.out.println("요리를 시작합니다.");
    }
}
