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
			switch (JOptionPane.showInputDialog("1추가 2수정 3삭제 4전체조회5학점조회6응시생수 0종료")) {

			case "1":

				break;
			case "2":

				break;
			case "3":

				break;
			case "4":

				break;
			case "5":

				break;
			case "6":

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