package bank;

/**
 * @date   : 2016. 7. 6.
 * @author : 신재현
 * @file   : AccountDAIO.java
 * @story   :
 */

public class AccountDAO {

private static AccountDAO instance = new AccountDAO();
	public static AccountDAO getInstance() {
	return instance;
}
	private AccountDAO() {
	// TODO Auto-generated constructor stub
}	
}
