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
public class BankController {
	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();
		BankService bankService = new BankServiceImpl();
		AccountBean acc = new AccountBean();
		int ok = 0;
		String spec = "";
		String[] specArr = new String[3];
		while (true) {

			switch (JOptionPane.showInputDialog("" + "=========개인인터넷뱅킹=======" + "1개설" + "2입금," + "3조회," + "4출금,"
					+ "5통장내역," + "==========은행창구=============" + "11개설" + "12전체조회" + "13계좌번호조회" + "14이름조회" + "15통장 수 조회"
					+ "16비번 수정" + "17통장해지" + "0종료")) {
			case "1":
				spec = JOptionPane.showInputDialog("이름,ID,PW");

				specArr = new String[3];
				specArr = spec.split(",");

				service.openAccount(specArr[0], specArr[1], specArr[2]);
				break;

			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액");
				// account.setMoney(Integer.parseInt(inputMoney));
				service.deposit(Integer.parseInt(inputMoney));
				break;

			case "3":
				// JOptionPane.showMessageDialog(null, service.findAccount());
				break;
			case "4":
				// account.withdraw(Integer.parseInt(JOptionPane.showInputDialog("출금액")));
				String outputMoney = JOptionPane.showInputDialog("출금액");
				JOptionPane.showMessageDialog(null, service.withdraw(Integer.parseInt(outputMoney)));
				break;
			case "5":
				JOptionPane.showMessageDialog(null, service.showAccount());

				break;

			case "11":// 계좌개설
				spec = JOptionPane.showInputDialog("이름,ID,PW");
				specArr = spec.split(",");

				acc.setAccountNo();
				acc.setName(specArr[0]);/// 하나의 종이에 적어서 창구에 주더라
				acc.setId(specArr[1]);
				acc.setPw(specArr[2]);
				bankService.openAccount(acc);

				break;
			case "12":
				JOptionPane.showMessageDialog(null, bankService.accountList());
				break;
			case "13": 
				String findAcc = JOptionPane.showInputDialog("검색하려는 계좌");
				acc = bankService.findByAccountNo(findAcc);
				JOptionPane.showMessageDialog(null, (acc.getName()==null)?"조회번호없음":acc.toString());
				
				break;

			case "14":
				String findName = JOptionPane.showInputDialog("검색하려는 이름");
				List<AccountBean> tempList = bankService.findByName(findName);

				JOptionPane.showMessageDialog(null, (tempList.isEmpty())?"검색하는 이름이 없습니다":tempList.toString());
				///if(condition){}elseif(){} ->보다 ()?:;가 훨씬 짧고 좋다
				////(종익이 남자)?존잘:거짓말;
				break;
			case "15":
				// int count = bankService.count();
				JOptionPane.showMessageDialog(null, "계좌수는" + bankService.count() + "개입니다");

				break;
			case "16":
				String change =JOptionPane.showInputDialog("수정하려는 계좌번호,바꿀비밀번호");
				String[] changeArr = change.split(",");
				String changeAcc = changeArr[0];
				String changePw = changeArr[1];
				acc.setAccountNo(Integer.parseInt(changeAcc));
				acc.setPw(changePw);
				JOptionPane.showMessageDialog(null, bankService.updateAccount(acc));
				
				break;
			case "17":
				String del = JOptionPane.showInputDialog("삭제하려는번호");
				JOptionPane.showMessageDialog(null, bankService.deleteAccount(del));
				break;

			default:
				ok = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				if (ok == 0) {
					return;
				} else {
					continue;
				}

			}

		}

	}
}
