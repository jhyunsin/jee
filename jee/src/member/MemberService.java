/**
 * 
 */
package member;

import java.util.List;

/**
 * @date : 2016. 6. 17.
 * @author : hb2009
 * @file : StudentService.java
 * @story :
 */
public interface MemberService {
	public String regist(MemberBean bean);

	public String show();

	public String update(MemberBean mem);

	public String delete(String id);

	public int count();

	public MemberBean findById(String findID);

	public List<MemberBean> list();

	public List<MemberBean> findByName(String findName);


}
// String sqlCreate = "create table member("
// + "id varchar2(20) primary key,"
// + "name varchar2(20),"
// + "ssn varchar2(20),"
// + "pw varchar2(20),"
// + "reg_date varchar2(20)"
// + "),";