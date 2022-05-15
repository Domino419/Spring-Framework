package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean1 t1 = ctx.getBean("t1", TestBean1.class) ;
		System.out.printf("t1: %s\n", t1);
		
		
		System.out.println("구분용--------");
		
		
		
		TestBean2 t2 = ctx.getBean("t2",TestBean2.class);
		System.out.printf("t2: %s\n", t2);
		
		System.out.println("구분용--------");
		
		
		
		
		//ctx.close는 Ioc 컨테이너가 가지고 있는 모든 bean객체를 소멸시켜 준다.
		ctx.close();
		

	}

}
