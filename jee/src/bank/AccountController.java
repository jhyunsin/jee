/**
 * 
 */
package bank;

import java.util.List;

import javax.swing.JOptionPane;

import member.MemberBean;
import member.MemberService;
import member.MemberServiceImpl;

/**
 * @date : 2016. 6. 15.`1
 * @author : hb2009
 * @file : accountController.java
 * @story :
 */
public class AccountController {
	public static void main(String[] args) {
		/// 싱글톤
		// 1개설 2 입금 3출금 4 비번변경 5 해지 6 조회(전체) 7계좌번호로 조회 8 이름으로 조회 9 통장수
		AccountService service = AccountServiceImpl.getInstance();
		MemberService memberService = MemberServiceImpl.getInstance();
		
		while (true) {
			switch (JOptionPane
					.showInputDialog("1개설 2 입금 3출금 4 비번변경 5 해지 " + 
			"6 조회(전체) 7계좌번호로 조회 8 이름으로 조회 9 통장수 10 로그인 0 종료")) {
					case "1":
						String id = JOptionPane.showInputDialog("ID");
						String msg = service.openAccount(id);
						JOptionPane.showMessageDialog(null, msg);
						break;
					case "2":
						String depositInfo = JOptionPane.showInputDialog("계좌,입금액");
						service.deposit(depositInfo);
						break;
			case "3":
			
				String withdrowInfo = JOptionPane.showInputDialog("계좌,출금액");
				service.withdraw(withdrowInfo);
				
				break;
			case "4":
				MemberBean stu2 = new MemberBean();
				String tempStr3 = JOptionPane.showInputDialog("ID,pw변경");
				String[] tempArr3 = tempStr3.split(",");
				stu2.setId(tempArr3[0]);
				stu2.setPw(tempArr3[1]);
				JOptionPane.showMessageDialog(null, service.updateAccount(stu2));
				
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.deleteAccount(Integer.parseInt(JOptionPane.showInputDialog("해지할 계좌번호"))));
				
				break;
			case "6":
				BankUI ui = new BankUI();
				
				break;
			case "7":
				break;
			case "8":
				break;
			case "9":
				JOptionPane.showMessageDialog(null, service.count());
				break;
			case "10":
				
				break;
				
			case "0":
				return;

			default:
				break;
			}
		}

	}
}
