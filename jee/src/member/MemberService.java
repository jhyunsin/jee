/**
 * 
 */
package member;

/**
 * @date : 2016. 6. 17.
 * @author : hb2009
 * @file : StudentService.java
 * @story :
 */
public interface MemberService {
	public void registstudent(String id, String pw, String name, String ssn);

	public String showStudent();

	public void updateStudent(String pw);

	public void deleteStudent();

}
