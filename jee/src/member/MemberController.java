/**
 * 
 */
package member;

import javax.swing.JOptionPane;

import com.sun.scenario.effect.AbstractShadow.ShadowMode;

import global.Constants;

/**
 * @date : 2016. 6. 16.
 * @author : hb2009
 * @file : SchoolController.java
 * @story :
 */
public class MemberController {
	public static void main(String[] args) {
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean s = null;
		// String id = null;
		int confirm = 0;
		while (true) {
			switch (JOptionPane.showInputDialog("" + "------회원이보는화면------\n" + 
		"1회원가입2로그인3내정보수정보기4(비번)수정5탈퇴 0종료\n"
					+ "------관리자가보는화면------\n" + 
		"11회원목록12검색(ID)13검색(이름)14 검색(성별)15회원수")) {
			case "1":
				MemberBean stu = new MemberBean();
				String spec = JOptionPane.showInputDialog("ID,PW,이름,주민번호");
				String[] specArr = spec.split(",");
				stu.setId(specArr[0]);
				stu.setPw(specArr[1]);
				stu.setName(specArr[2]);
				stu.setSsn(specArr[3]);
				stu.setRegDate();
				// service.regist(specArr[0], specArr[1], specArr[2],
				// specArr[3]);
				String result = service.regist(stu);
				JOptionPane.showMessageDialog(null, result);
				break;

			case "2":
				JOptionPane.showMessageDialog(null, Constants.SCHOOL_NAME + service.show());

				break;// case2에서 이름 id 성별을 출력
			case "3":
				break;
			case "4":
				MemberBean tempBean3 = new MemberBean();
				String tempStr3 = JOptionPane.showInputDialog("ID,pw변경");
				String[] tempArr3 = tempStr3.split(",");
				tempBean3.setId(tempArr3[0]);
				tempBean3.setPw(tempArr3[1]);
				
				JOptionPane.showMessageDialog(null, service.update(tempBean3));
				
				
				
				
				break;
			case "5":
			//	MemberBean tempBean4 = new MemberBean();
//				String tempStr4 = JOptionPane.showInputDialog("ID삭제");
//				JOptionPane.showMessageDialog(null, service.delete(tempStr4));
				JOptionPane.showMessageDialog(null, service.delete(JOptionPane.showInputDialog("id삭제")));
			
				
				
				break;
			case "11":
				JOptionPane.showMessageDialog(null, service.list());
				break;
			
			case "12":
				String  findID =  JOptionPane.showInputDialog("조회할아이디");
				JOptionPane.showMessageDialog(null, service.findById(findID));
				
				break;
			
			case "13":
				String findName = JOptionPane.showInputDialog("조회할이름");
				JOptionPane.showMessageDialog(null, service.findByName(findName));
				break;
			case "14":
				
				break;
			
			case "15":
				int count = service.count();
				JOptionPane.showMessageDialog(null,count+"명");
				
				break;
				
			case "0":
				confirm = JOptionPane.showConfirmDialog(null, "종료??");
				if (confirm == 0) {

				} else {
					continue;
				}
				return;

			default:
				break;
			}

		}

	}
}
