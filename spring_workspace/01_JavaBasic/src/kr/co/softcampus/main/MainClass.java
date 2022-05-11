package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorldko;
import kr.co.softcampus.beans.HelloWorldEn;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloWorldko();
		//HelloWorldEn hello1 = new HelloWorldEn ();
		HelloWorldko hello1 = new HelloWorldko ();
		callMetthod2(hello1) ;

		HelloWorldko hello2 = new HelloWorldko ();
		callMetthod2(hello2) ;
	}

	public static void callMetthod(HelloWorldEn hello) {
		hello.sayHello();
	}
	public static void callMetthod2(HelloWorldko hello) {
		hello.sayHello();
	}
}


//java 프로젝트에서 클래스가 변경되면 객체 생성 부분과 참조 변수 선언 부분 모두를 수정해야 한다 