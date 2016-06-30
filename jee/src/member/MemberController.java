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
		MemberService service = new MemberServiceImpl();
		MemberBean s = null;
		// String id = null;
		int confirm = 0;
		while (true) {
			switch (JOptionPane.showInputDialog("1등록 2보기 3수정 4삭제 0종료")) {
			case "1":
				String spec = JOptionPane.showInputDialog("ID,PW,이름,주민번호");
				String[] specArr = spec.split(",");
				
				service.registstudent(specArr[0], specArr[1], specArr[2], specArr[3]);

				break;

			case "2":
				JOptionPane.showMessageDialog(null,Constants.SCHOOL_NAME + service.showStudent());

				break;// case2에서 이름 id 성별을 출력
			case "3":
				service.updateStudent(JOptionPane.showInputDialog("pw변경"));
				break;
			case "4":
				service.deleteStudent();
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
