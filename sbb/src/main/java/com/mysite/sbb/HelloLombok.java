package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
// import lombok.Setter;

@RequiredArgsConstructor
// hello, lombok 속성에 final을 적용하고 롬복의 @RequiredArgsConstructor 
// 애너테이션을 적용하면 해당 속성을 필요로하는 생성자가 롬복에 의해 자동으로 생성된다.
// (※ final이 없는 속성은 생성자에 포함되지 않는다.)
@Getter
// @Setter
public class HelloLombok {

//    private String hello;
//    private int lombok;
	
	private final String hello;
	private final int lombok;
	

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok("헬로",5);
//        helloLombok.setHello("헬로");
//        helloLombok.setLombok(5);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}