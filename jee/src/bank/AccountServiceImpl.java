/**
 * 
 */
package bank;

import java.util.List;

import member.MemberBean;

/**
 * @date   : 2016. 6. 20.
 * @author : hb2009
 * @file   : AccountServiceIMmpl.java
 * @story  : 계좌 인터페이스
  */
public class AccountServiceImpl implements AccountService {
	AccountDAO dao = AccountDAO.getInstance();
	private static AccountServiceImpl instance = new AccountServiceImpl();
	public static AccountServiceImpl getInstance() {
	return instance;
}

	private AccountServiceImpl() {
		
	}

	@Override
	public String openAccount(String id) {
		// 개설
		AccountBean acc = new AccountBean();
		acc.setAccountNo();
		acc.setId(id);
		acc.setMoney(0);
		String msg = "";		
		if (dao.insertAccount(acc)==1) {
			msg = "계좌 생성완료";
		} else {
			msg = "계좌 생성실패";
		}
				return msg;
	}

	@Override
	public void deposit(String depositInfo) {
		// 입금
		String[] arr = depositInfo.split(",");
		AccountBean acc = new AccountBean();
		acc.setAccountNo(Integer.parseInt(arr[0]));
		int money = this.restMoney(Integer.parseInt(arr[0])) + Integer.parseInt(arr[1]);
		acc.setMoney(money);
		dao.deposit(acc);
	}

	@Override
	public String withdraw(String withdrowInfo) {
		// 출금
		String result = "";
		String[] arr = withdrowInfo.split(",");
		AccountBean acc = new AccountBean();
		acc.setAccountNo(Integer.parseInt(arr[0]));
		int restMoney = this.restMoney(Integer.parseInt(arr[0]));
		int withdrawMoney = Integer.parseInt(arr[1]);
		if (restMoney < withdrawMoney) {
			result = "잔액이 부족합니다";
		}else {
		
		acc.setMoney(restMoney-withdrawMoney);
		dao.withdraw(acc);
		result = "잔액 : "+String.valueOf(this.restMoney(Integer.parseInt(arr[0])));
		}
		
		return result;
	}

	@Override
	public String updateAccount(MemberBean stu2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteAccount(int accountNo) {
		// TODO Auto-generated method stub
		return dao.deleteAccount(accountNo);
	}

	@Override
	public List<AccountBean> accountList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> findByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return dao.count();
	}

	@Override
	public int restMoney(int accNo) {
		// TODO Auto-generated method stub
		return dao.selectMoney(accNo);
	}


	


	

	

	
	
}