/**
 * 
 */
package bank;

import java.util.List;

/**
 * @date : 2016. 6. 20.
 * @author : hb2009
 * @file : AccountService.java
 * @story :
 */
public interface AccountService {


	// 1개설
	public abstract void openAccount(AccountBean acc);

	// 2 입금
	public void deposit(int inputMoney);

	// 3출금
	public String withdraw(int output);

	// 4수정..사용자의 요청에 의해 비번만 전환가능
	public String updateAccount(AccountBean acc);

	// 5해지
	public void deleteAccount();

	// 6조회 (전체)
	public List<AccountBean> accountList(); // 빅빈을 사용한다 빈은 사용하지 않는다

	// 7조회(계좌번호)
	public AccountBean findByAccountNo(String searchAcc);

	// 8 조회(이름)
	public List<AccountBean> findByName(String name);

	// 9통장(전체통장수)
	public int count(); 

}
