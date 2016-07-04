package grade;

/**
 * @date   : 2016. 7. 4.
 * @author : 신재현
 * @file   : GradeDAO.java
 * @story   :
 */

public class GradeDAO {///싱글톤은 DAO부터
private static GradeDAO instance = new GradeDAO();

public static GradeDAO getInstance() {
	return instance;
}


private GradeDAO() {
	// TODO Auto-generated constructor stub
}
	
}
