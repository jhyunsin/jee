/**
 * 
 */
package bank;

import java.util.List;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 15.`1
 * @author : hb2009
 * @file : accountController.java
 * @story :
 */
public class AccountController {
	public static void main(String[] args) {
		///싱글톤
	
		// 1개설 2 입금 3출금 4 비번변경 5 해지 6 조회(전체) 7계좌번호로 조회 8 이름으로 조회 9 통장수
		
		while (true) {
			switch (JOptionPane.showInputDialog("1개설 2 입금 3출금 4 비번변경 5 해지 "
					+ "6 조회(전체) 7계좌번호로 조회 8 이름으로 조회 9 통장수 0 종료")) {
			case "1":break;
			case "2":break;
			case "3":break;
			case "4":break;
			case "5":break;
			case "6":break;
			case "7":break;
			case "8":break;
			case "9":break;
			case "0":return;
				
				

			default:
				break;
			}
		}
		
	}
}
