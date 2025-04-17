package com.study.springcore.chap01;

public class Hotel {
    /**
     * @problem - 호텔 클래스에서 직접 객체를 생성하면
     *            나중에 의존객체(레스토랑, 헤드쉐프)를 변경해야 할 때
     *            직접 호텔 클래스를 수정해야 하므로 OCP를 위반하게 됨.
     *            그리고, headChef가 변경되면 레스토랑 안에 쉐프도
     *            같이 바뀌어야 할 때 2군데를 수정해야 함.
     */
    //레스토랑
    private WesturnRestaurant restaurant = new WesturnRestaurant();

    //헤드 쉐프
    private JohnChef chef = new JohnChef();

    WesturnCourse course = new WesturnCourse() ;


    // 호텔을 소개하는 기능
    public void inform(){
        System.out.printf("우리 호텔의 레스토랑은  %s 입니다. 그리고 헤드 쉐프는 %s입니다. \n",
                restaurant.getClass().getSimpleName(), chef.getClass().getSimpleName());
        restaurant.order();
        chef.cook();
        course.combineMenu();
    }
}
