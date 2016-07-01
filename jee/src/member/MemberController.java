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
			switch (JOptionPane.showInputDialog("1등록 2보기 3수정 4삭제 0종료")) {
			case "1":
				MemberBean stu = new MemberBean();
				String spec = JOptionPane.showInputDialog("ID,PW,이름,주민번호");
				String[] specArr = spec.split(",");
				stu.setId(specArr[0]);
				stu.setPw(specArr[1]);
				stu.setName(specArr[2]);
				stu.setSsn(specArr[3]);
				// service.regist(specArr[0], specArr[1], specArr[2],
				// specArr[3]);
				String result = service.regist(stu);
				JOptionPane.showMessageDialog(null, result);
				break;

			case "2":
				JOptionPane.showMessageDialog(null, Constants.SCHOOL_NAME + service.show());

				break;// case2에서 이름 id 성별을 출력
			case "3":
				service.update(JOptionPane.showInputDialog("pw변경"));
				break;
			case "4":
				service.delete();
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
