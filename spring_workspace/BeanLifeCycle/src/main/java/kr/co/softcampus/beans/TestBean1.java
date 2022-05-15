package kr.co.softcampus.beans;

public class TestBean1 {
	public TestBean1() {
		System.out.println("testBean1의 생성자입니다");
		
	}
	//내가 만든 Bean을 다른 개발자들이 사용하는 경우 
	//객체를 생성하는 것 만으로도 자동으로 호출하도록 하고 싶으면 bean.xml에서 init-method설정을 바꿔주면 됨.
	public void bean1_init() {
		System.out.println("TestBean1의 init 메서드");
		
	}
	
	public void bean1_destroy() {
		System.out.println("TestBean1의 destroy 메서드");
		
	}

}
