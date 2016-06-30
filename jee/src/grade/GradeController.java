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
	/*
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다 이름과 국 영 수 세과목 점수를 입력받아서 [홍길동 : 총점 ***점, 평균 ***점,
	 * 합격여부(불합격)] 을 출력하는 프로그램을 만들어 주세요 단) 평균은 소수점이하는 절삭합니다 평균점수가 80이상이면 B 70이상이면
	 * C 60이상이면 D 50이상이면 E 50미만이면 F 단 switch-case문으로 해결하세요
	 */
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		int ok = 0;
		while (true) {
			switch (JOptionPane.showInputDialog("1실행 0종료")) {

			case "1":
				service.inputGrade(JOptionPane.showInputDialog("이름,국어,영어,수학 입력"));
				JOptionPane.showMessageDialog(null, service.showGrade());
				break;

			default:
				JOptionPane.showConfirmDialog(null, "Closing ok?");
				if (ok == 0) {

				} else {
					continue;
				}
				return;
			}
		}
	}
}