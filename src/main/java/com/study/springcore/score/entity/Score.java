package com.study.springcore.score.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//데이터베이스 테이블과 1:1과 1:1로 매칭되는 필드를 가지는 객체: Entity
@Getter
@Setter
@ToString
public class Score {
    private  int stuNum;
    private String  stuName;
    private  int kor;
    private  int eng;
    private  int math;
    private  int total;
    private  double average;
    private Grade grade ;

    public Score(String stuName, int kor, int eng, int math) {
        this.stuName = stuName;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}
