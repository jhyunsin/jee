package bank;

import java.util.ArrayList;
import java.util.List;

/**
 * @date : 2016. 6. 27.
 * @author : 신재현
 * @file : BankServiceImpl.java
 * @story :
 */

public class BankServiceImpl implements BankService { // 은행전체

	List<AccountBean> list;
	AccountBean account;
	AccountBean acc = new AccountBean();
	/// AccountBean[] bean = new AccountBean[3];

	public BankServiceImpl() {///////// 동기화시킬까요 말까요???
		// TODO Auto-generated constructor stub
		list = new ArrayList<AccountBean>();
		//list = new Vector<AccountBean>(); 다형성
	}

	@Override
	public void openAccount(AccountBean acc) { // add size 생성자가 아니라 setter
		// 11개설 - 은행창구개설 (한장에 담아서)
		list.add(acc);
		// this.bean[0] = bean;

	}

	@Override
	public List<AccountBean> accountList() {
		// 12계좌조회전체
		// return list.toString();
		return list;
	}

	@Override
	public AccountBean findByAccountNo(String searchAcc) {
		// 13계좌번호조회
		AccountBean acc = new AccountBean();
		int i = 0;
		for (; i < list.size(); i++) {
			String temp = String.valueOf(list.get(i).getAccountNo());
			if (temp.equals(searchAcc)) {
				acc = list.get(i);
				break;
			}
		}
		return acc;
	}

	@Override
	public List<AccountBean> findByName(String name) {
		// 14 이름조회 리턴타입을 객체로 받아라...
		List<AccountBean> tempList = new ArrayList<AccountBean>();
		System.out.println("컨트롤러에서 넘어온 이름" + name);
		for (int i = 0; i < this.list.size(); i++) {
			if (name.equals(this.list.get(i).getName())) {
				tempList.add(this.list.get(i));
			}
		}
		return tempList;

	}

	@Override ////////////////////////////////////////////
	public int count() {
		// 15 계좌수
		return list.size();
		// 1차원 lotto.length 2차원 lotto.length

	}

	@Override
	public String updateAccount(AccountBean acc) {
		// 16수정 비밀번호만

		System.out.println("넘어온수정정보" + acc);
		String result = "";
		AccountBean temp = this.findByAccountNo(String.valueOf(acc.getAccountNo()));
		if (temp.getId() == null) {
			result = "계좌번호가 존재하지 않습니다";
		} else {
			temp.setPw(acc.getPw());
			result = "비밀번호 변경되었습니다";// 두개라서 삼항연산자가 안된다
		}
		return result;
	}

	@Override
	public String deleteAccount(String searchAcc) {
		String result="";
		AccountBean temp = this.findByAccountNo(searchAcc);
		if (temp.getName()==null) {
			result = "계좌가 없습니다";
		} else {
		this.list.remove(temp);
			result = "계좌가삭제되었습니다";
		}
		return result;
	}

}
