/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 20.
 * @author : hb2009
 * @file : AccountService.java
 * @story : 빈으로 나눔
 */
public class AccountService2 {
	// 1개설2입금,3조회,4출금,5통장내역
	AccountBean account; ///????

	// 1개설
	public void openAccount(String name,String id, String pw) {
		account = new AccountBean(name,id,pw);
			}
	// 2 입금

	public void deposit(int inputMoney) {
		int money = account.getMoney();
		money += inputMoney;
		account.setMoney(money);

	}

	// 3조회
	public void findAccount() {

	}

	// 4출금
	public String withdraw(int output) {// 메소드를 만들때 겟 셋이냐에 따라 모양을 만든다

		String result = "잔액부족";
		int money = account.getMoney();

		if (output <= money) {
			money -= output;
			account.setMoney(money);
			result = String.valueOf(account.getMoney());
		}
		return result;
	}

	// 5통장내역
	public String showAccount() {
		String result = "";
		return account.toString();
	}

	// 6해지
	public void deleteAccount() {
		account = null;
	}

}
