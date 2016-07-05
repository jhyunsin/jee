package grade;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 8.
 * @author : hb2009
 * @file : Avg.java
 * @story :
 */
public class GradeController {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다 이름과 국 영 수 세과목 점수를 입력받아서 [홍길동 : 총점 ***점, 평균 ***점,
	 * 합격여부(불합격)] 을 출력하는 프로그램을 만들어 주세요 단) 평균은 소수점이하는 절삭합니다 평균점수가 80이상이면 B 70이상이면
	 * C 60이상이면 D 50이상이면 E 50미만이면 F 단 switch-case문으로 해결하세요
	 */

	public static void main(String[] args) {

		GradeService service = GradeServiceImpl.getInstance();
		GradeDAO dao = GradeDAO.getInstance();
				
		
		while (true) {
			switch (JOptionPane.showInputDialog("1추가 2수정 3삭제 4전체조회 5학점을 포함한 시험내역 6시퀀스조회(ID) 0종료")) {
		
			case "1":
				
				String temp = JOptionPane.showInputDialog("자바,SQl,HTML,JAVAscript,ID,examDate");
				String[] tempArr = temp.split(",");
				GradeBean grade = new GradeBean();
				grade.setJava(Integer.parseInt(tempArr[0]));
				grade.setSql(Integer.parseInt(tempArr[1]));
				grade.setHtml(Integer.parseInt(tempArr[2]));
				grade.setJavascript(Integer.parseInt(tempArr[3]));
				grade.setId(tempArr[4]);
				grade.setExamDate(tempArr[5]);
				JOptionPane.showMessageDialog(null, service.insert(grade));
				
				break;
			case "2":
				GradeBean grade2 = new GradeBean();
				String temp2 = JOptionPane.showInputDialog("자바,SQl,HTML,JAVAscript,ID");
				String[] tempArr2 = temp2.split(",");
				grade2.setJava(Integer.parseInt(tempArr2[0]));
				grade2.setSql(Integer.parseInt(tempArr2[1]));
				grade2.setHtml(Integer.parseInt(tempArr2[2]));
				grade2.setJavascript(Integer.parseInt(tempArr2[3]));
				grade2.setId(tempArr2[4]);
				service.update(grade2);
				JOptionPane.showMessageDialog(null, service.update(grade2));
				break;
			case "3":
				String temp3 = JOptionPane.showInputDialog("삭제할 seq를 입력");
				JOptionPane.showMessageDialog(null, service.delete(Integer.parseInt(temp3)));
				break;
			case "4":
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "5":
				
				
				break;
			case "6":
				JOptionPane.showMessageDialog(null, service.findById(JOptionPane.showInputDialog("조회할 id입력")));
				break;
			case "7":

				break;
			case "0":

				return;

			default:
				break;
			}
		}
	}
}