package com.study.springcore.chap04.rest;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

//빈등록을 해야 요청이 들어왔을 때 메서드 호출할 수 있다.
//RestController 안에 있는 모든 메서드는 return 값이 JSON으로 변환되어
// 클라이언트에게 전송됩니다. -> 더이상 백엔드는 화면에 관여하지 않습니다.
@RestController
public class RestControllerTest {

    @GetMapping("/rest/list")
//    @ResponseBody -> 클라이언트로 데이터를 JSON으로 변환 후 던지는 문법
    public List<String> method1(){
        List<String> list = List.of("one","two","three","four","five");
        return list;
    }

    @PostMapping("/rest/object")
    public Person method2(){
        Person person = new Person();
        person.setAge(20);
        person.setName("김춘식");
        person.setHobbies(List.of("놀기","밥먹기","독서"));
        return person;
    }

    //클라이언트(리액트)단에서 JSON 데이터를 보내고 있다.
    //1. JSON 형태로 생긴 객체가 있다? -> 그 객체로 받으면 되고
    //2. JSON 형태로 생긴 클래스가 없다? -> Map으로 받으면 됩니다.
    //클라이언트가 전송하는 데이터가 JSON이라면 @RequestBody를 붙여야
    // 자바 객체로 변환이 가능합니다. -> 안붙이면 텅텅 빈 객체를 확인하게 됨.
    @PostMapping("/rest/regist")
    public String method3(@RequestBody Person person){
        System.out.println("전달된데이터:"+person);
        return "OK!";

    }

    //데이터 규격없이 가볍게 받을 경우에만.. 비추
//    public String method3(@RequestBody Map<String, Object> map){
//        System.out.println("전달된데이터:"+map);
//        return "OK!";
//    }

}
