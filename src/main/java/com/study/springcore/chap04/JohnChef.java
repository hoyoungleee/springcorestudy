package com.study.springcore.chap04;

import org.springframework.stereotype.Component;

//스프링이 자동으로 객체생성하고, 그 객체의 생명주기 및 기타등등을 관리하게 하겠다.
@Component("John")
public class JohnChef implements Chef {

    public void cook(){
        System.out.println("안녕하세요. John Chef 입니다.");
        System.out.println("요리를 시작합니다.");
    }
}
