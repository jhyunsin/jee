package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;
import member.MemberBean;

/**
 * @date : 2016. 7. 4.
 * @author : 신재현
 * @file : GradeDAO.java
 * @story :
 */

public class GradeDAO {/// 싱글톤은 DAO부터

	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	private static GradeDAO instance = new GradeDAO();
	public static GradeDAO getInstance() {
		return instance;
	}

	private GradeDAO() {
	con = DatabaseFactory.createDatabase(
			Vendor.ORACLE, Constants.USER_ID, Constants.USER_PW)
			.getConnection();
	}

	public int exeUpdate(String sql) {
		int result = 0;

		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (result == 1) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		return result;

	}

	public int insert(GradeBean bean){
//		String sql = "insert into grade(seq,grade,java,sql,html,javascript,id,exam_date)values(seq.nextval,'"
//				+ ""+bean.getGrade()+"',"
//				+ ""+bean.getJava()+","
//				+ ""+bean.getSql()+","
//				+ ""+bean.getHtml()+","
//				+ ""+bean.getJavascript()+",'"
//				+ ""+bean.getId()+"','"
//				+ ""+bean.getExamDate()+"')";
				
		String sql = "insert into grade(seq,grade,java,sql,html,javascript,id,exam_date)values(seq.nextval,?,?,?,?,?,?,?)";
		int result =0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			pstmt = con.prepareStatement(sql);
		pstmt.setString(1, bean.getGrade());
		pstmt.setInt(2, bean.getJava());
		pstmt.setInt(3, bean.getSql());
		pstmt.setInt(4, bean.getHtml());
		pstmt.setInt(5, bean.getJavascript());
		pstmt.setString(6, bean.getId());
		pstmt.setString(7, bean.getExamDate());
		result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	public int update(GradeBean bean){
		String sql = "update grade set java = " + bean.getJava() + " sql = " + bean.getSql() + " html=" + bean.getHtml()
				+ "javascript=" + bean.getJavascript() + "grade=" + bean.getGrade() + "  where seq = " + bean.getId()
				+ "";
		
		return this.exeUpdate(sql);
	}

	public int delete(int seq) {
		// 삭제
		String sql = "delete from grade where seq = "+seq+"";
		
		return this.exeUpdate(sql);
	}

	public List<GradeBean> list() {
		// TODO Auto-generated method stub
		String sql ="select * from grade";
		List<GradeBean> list = new ArrayList<GradeBean>();
			try {
			Class.forName(Constants.ORACLE_DRIVER);
		con = DriverManager.getConnection(//get이니까 리턴값이 필요하다 ,,, 내부적으로 싱글톤을 던진것이다
				Constants.ORACLE_URL,
				Constants.USER_ID,
				Constants.USER_PW);
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			GradeBean t = new GradeBean(
					rs.getInt("SEQ"),
					rs.getString("GRADE"),
					rs.getInt("JAVA"),
					rs.getInt("SQL"),
					rs.getInt("HTML"),
					rs.getInt("JAVASCRIPT"),
					rs.getString("ID"), 
					rs.getString("EXAM_DATE")
					);
				list.add(t);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public List<GradeBean> findById(String id) {
		// TODO Auto-generated method stub
	
			String sql = "select * from grade where id='" + id + "'";
			List<GradeBean> list = new ArrayList<GradeBean>();
			try {
				Class.forName(Constants.ORACLE_DRIVER);
				con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
				stmt = con.createStatement();
				rs = stmt.executeQuery(sql);
				if (rs.next()) {
					GradeBean t = new GradeBean(rs.getInt("SEQ"), rs.getString("GRADE"), rs.getInt("JAVA"), rs.getInt("SQL"), 
							rs.getInt("HTML"), rs.getInt("JAVASCRIPT"), rs.getString("ID"), rs.getString("EXAM_DATE"));
					list.add(t);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return list;
		
	}
		
		
		
	
}
