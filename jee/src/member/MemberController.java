/**
 * 
 */
package member;

import javax.print.attribute.standard.JobKOctetsProcessed;
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
				MemberBean stu4 = new MemberBean();
				String input4 = JOptionPane.showInputDialog("ID,PW");
				String[]inputArr4 = input4.split(",");
				stu4.setId(inputArr4[0]);
				stu4.setPw(inputArr4[1]);
				String result4 = service.login(stu4);
				JOptionPane.showMessageDialog(null, result4);
				break;
			case "3":
				JOptionPane.showMessageDialog(null, service.show());
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
				String result3 = service.delete(JOptionPane.showInputDialog("ID"));
				JOptionPane.showMessageDialog(null, result3);
				
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
		 
		 JOptionPane.showMessageDialog(null,service.genderCount(JOptionPane.showInputDialog("성별 입력"))+" 명"	 );
				
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
