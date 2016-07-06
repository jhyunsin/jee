/**
 * 
 */
package bank2;

import java.util.Random;

import javax.swing.JOptionPane;

import global.Constants;

/**
 * @date : 2016. 6. 16.
 * @author : hb2009
 * @file : Acccount.java
 * @story :
 */
public class AccountBean {
	private int accountNo; // 인스턴스 변수는 초기화를 하지 않는다
	private String name;
	private int money;
	// private String bankName; 상수처리 한다 21줄
	private String pw;
	private String id;// 속성은 감추고 기능은 오픈한다
	public final static String BANK_NAME = "한빛은행"; // 상수 instance

	
	/**
	 * 
	 */
	public AccountBean() {
		// default constructor 기본 생성자
		// 생성자 오버로딩
	}
	
	public AccountBean(String name,String id,String pw) { // 생성자
		this.accountNo = (int) (Math.random() * 999999) + 100000;
		this.name = name;
		this.id = id;
		this.pw = pw;
		
	}
	
	public void setAccountNo() {
		this.accountNo = (int) (Math.random() * 999999) + 100000;
	}
		
	public void setAccountNo(int accountNo){
		this.accountNo = accountNo;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// public void setBankname(String bankname) {
	// this.bankName = bankname;
	// }

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return this.name;
	}

	public int getAccountNo() {
		return this.accountNo;
	}

	public int getMoney() {
		return this.money;
	}

	// public String getBankname() {
	// return this.bankName;
	// }

	public String getPw() {
		return this.pw;
	}

	public String getId() {
		return this.id;
	}
	

	
	@Override
	public String toString() {// 메소드 오버라이딩
		return Constants.BANK_NAME+" [계좌정보=" + accountNo + ", 이름=" + name + ", 잔액=" + money + ", 비번=" + pw + ", 아이디="
				+ id + "]";
	}

}
