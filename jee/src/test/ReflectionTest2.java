package test;

import bank.AccountBean;

/**
 * @date : 2016. 7. 1.
 * @author : 신재현
 * @file : ReflectionTest.java
 * @story :
 */

public class ReflectionTest2 {
	public static void main(String[] args) {
		// MemberBean mem = new MemberBean();
		try {
			// String i = String.valueOf(0);
			// int i2 = Integer.parseInt("홍길동");

			AccountBean acc = (AccountBean) Class.forName("bank.AccountBean").newInstance();//Eric Gamma
			AccountBean acc2 = (AccountBean) Class.forName("bank.AccountBean").newInstance();
			AccountBean acc3 = (AccountBean) Class.forName("bank.AccountBean").newInstance();
			
			acc.setAccountNo(12345);
			acc.setName("홍길동");
			acc.setMoney(5000);
			acc.setId("hong");
			acc.setPw("1");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
