package member;

public class MemberServiceImpl implements MemberService {
	MemberBean student = null;
	MemberDAO dao = MemberDAO.getInstance();

	private static MemberServiceImpl instance = new MemberServiceImpl();

	public static MemberServiceImpl getInstance() {
		return instance;
	}

	private MemberServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String regist(MemberBean mem) {
		// 1등록
		String msg = "";
		String sql = "insert into member(id,pw,name,reg_date,ssn)" + "values('" + mem.getId() + "','" + mem.getPw()
				+ "','" + mem.getName() + "','" + mem.getRegDate() + "','" + mem.getSsn() + "')";
		int result = dao.exeUpdate(sql);
		if (result == 1) {
			msg = "회원가입축하";
		} else {
			msg = "회원가입실패";
		}

		return msg;
	}

	@Override
	public String show() {
		// 2보기
		return student.toString();
	}

	@Override
	public void update(String pw) {
		// 3수정
		student.getPw();
	}

	@Override
	public void delete() {
		// 4삭제
		student = null;
	}

}
