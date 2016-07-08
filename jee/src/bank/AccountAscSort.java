package bank;

import java.util.Comparator;

/**
 * @date   : 2016. 7. 8.
 * @author : 신재현
 * @file   : NameAscSort.java
 * @story   :
 */

public class AccountAscSort implements Comparator<AccountMemberBean>{

public int compare(AccountMemberBean first, AccountMemberBean second){
	
	return first.getName().compareTo(second.getName());
}	

}
