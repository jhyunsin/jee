package global;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 30.
 * @author : 신재현
 * @file : File.java
 * @story :
 */

public class FileTest {
	public static void main(String[] args) {
		File file = null;
		FileWriter fw = null;
		FileReader fr = null; // 한줄 읽는놈
		BufferedWriter bw = null;
		BufferedReader br = null; // 여러줄 읽는 놈
		String msg = "";
		try {

			while (true) {
				switch (JOptionPane.showInputDialog("1생성 2쓰기 3읽기 4수정 5삭제 0종료")) {
				case "1":
					String fileName = JOptionPane.showInputDialog("파일명");
					file = new File("C:\\Users\\hb2009\\workspace\\" + fileName + ".txt");
					fw = new FileWriter(file, true);/// ture 이어서 써라
					fr = new FileReader(file);
					bw = new BufferedWriter(fw);/// 여러개 쓰는놈
					br = new BufferedReader(fr);
					break;
				case "2":
					msg = JOptionPane.showInputDialog("메세지?");
					bw.write(msg);
					// fw.flush();
					bw.flush();/// 글을 쓸때는 플러쉬가 마지막 동작
					break;
				case "3":
					while ((msg = br.readLine()) != null) {
						JOptionPane.showMessageDialog(null, msg);
					}
					fr.close();
					br.close();
					break;
				case "4":
					String updateFileName = JOptionPane.showInputDialog("수정하려는 파일명");
					File updateFile = new File("C:\\Users\\hb2009\\workspace\\" + updateFileName + ".txt");
					bw = new BufferedWriter(new FileWriter(updateFile));
					String updateMsg = JOptionPane.showInputDialog("수정메세지");
					bw.write(updateMsg);
					bw.flush();
					break;
				case "5":
					String delFileName = JOptionPane.showInputDialog("삭제하려는 파일명");
					File delFile = new File("C:\\Users\\hb2009\\workspace\\" + delFileName + ".txt");
					file.delete();
					break;
				case "0":

					fw.close();
					bw.close();
					fr.close();
					br.close();
					return;

				default:
					break;
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {/// 보험 플러쉬가 안먹었을경우 타
			try {
				fw.flush();
				bw.flush();
				fw.close();
				bw.close();
				fr.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
