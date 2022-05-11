package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorld;
import kr.co.softcampus.beans.HelloWorldEn;
import kr.co.softcampus.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new HelloWorldEn(); 
		//HelloWorld Hello1 = new HelloWorldEn() ;
		//callMethod(Hello1);

		//HelloWorld Hello2 = new HelloWorldEn() ;
		//callMethod(Hello2);
		
		HelloWorld Hello1 = new HelloWorldKo() ;
		callMethod(Hello1);

		HelloWorld Hello2 = new HelloWorldKo() ;
		callMethod(Hello2);
	}
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
		
	}

}
  //다형성 개념을 사용하면 클래스가 변경되었을 때 참조 변수 선언 부분은 수정하지 않아도 되지만, 객체를 생성하는 부분의 코드는 변경되어야 한다.