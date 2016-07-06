/**
 * 
 */
package bank;

import java.util.List;

/**
 * @date   : 2016. 6. 20.
 * @author : hb2009
 * @file   : AccountServiceIMmpl.java
 * @story  : 계좌 인터페이스
  */
public class AccountServiceImpl implements AccountService {
AccountDAO dao = AccountDAO.getInstance();
	private AccountServiceImpl instance = new AccountServiceImpl();
	public AccountServiceImpl getInstance() {
	return instance;
}

	private AccountServiceImpl() {
		}
	
	@Override
	public void openAccount(AccountBean acc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(int inputMoney) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String withdraw(int output) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateAccount(AccountBean acc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AccountBean> accountList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNo(String searchAcc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}