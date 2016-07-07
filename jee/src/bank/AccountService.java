/**
 * 
 */
package bank;

import java.util.List;

import member.MemberBean;

/**
 * @date : 2016. 6. 20.
 * @author : hb2009
 * @file : AccountService.java
 * @story :
 */
public interface AccountService {


	// 1개설
	public String openAccount(String id);

	// 2 입금
	public void deposit(String depositInfo);

	// 3출금
	public String withdraw(String withdrowInfo);

	// 4수정..사용자의 요청에 의해 비번만 전환가능
	public String updateAccount(MemberBean stu2);

	// 5해지
	public int deleteAccount(int AccountNo);

	// 6조회 (전체)
	public List<AccountBean> accountList(); // 빅빈을 사용한다 빈은 사용하지 않는다

	// 7조회(계좌번호)
	public AccountBean findByAccountNo();

	// 8 조회(이름)
	public List<AccountBean> findByName();

	// 9통장(전체통장수)
	public int count();
// 원래 요구사항에는 없었지만, 필요에 따라 생성하는 매소드
	public int restMoney(int accNo);
	





}
