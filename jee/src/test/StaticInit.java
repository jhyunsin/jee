package test;

/**
 * @date : 2016. 7. 1.
 * @author : 신재현
 * @file : StaticInit.java
 * @story : 스태틱 초기화 블록
 */

public class StaticInit {///객체를 생성하면 생성자가 자동으로 호출된다

	public static void main(String[] args) {
		StaticInitClass a1 = new StaticInitClass();
		System.out.println("----------------------");
		StaticInitClass a2 = new StaticInitClass();
		System.out.println("----------------------");
		StaticInitClass a3 = new StaticInitClass();

	}

}
