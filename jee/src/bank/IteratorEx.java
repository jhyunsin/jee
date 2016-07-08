package bank;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @date   : 2016. 7. 8.
 * @author : 신재현
 * @file   : IteratorEx.java
 * @story   :
 */

public class IteratorEx {/// 순환기 지하철2호선
public static void main(String[] args) {
	Map<?,?> map = new HashMap<String,AccountMemberBean>();
	AccountDAO dao = AccountDAO.getInstance();
	map  = dao.selectMap(); 
	Set<?> keyset = map.keySet();
	Iterator<?> it = keyset.iterator();///부분카피개념
	while (it.hasNext()) {
		String key = (String) it.next();
//		System.out.println(map.get(key));
	}

	Collection<?> accounts = map.values();
	it = accounts.iterator();
	List<AccountMemberBean> list = new ArrayList<AccountMemberBean>();
	while (it.hasNext()) {
		AccountMemberBean obj = (AccountMemberBean) it.next();
		if (obj.getName().equals("유관순")) {
			list.add(obj);
		}
		
		//System.out.println(list);
	} 
	Collections.sort(list, new NameAscSort());
for (int i = 0; i < list.size(); i++) {//스트링값에 대한 오름차순정렬
//	System.out.println(list.get(i)+"\n");
}
	Collections.sort(list, new AccountAscSort());
	for (int i = 0; i < list.size(); i++) {//인트값에 대한 오름차순정렬
		System.out.println(list.get(i)+"\n");
	}
}
}
