package member;

import java.util.List;

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
	public String regist(MemberBean bean) {
		// 1등록
		String msg = "";
//		String sql = "insert into member(id,pw,name,reg_date,ssn)" + "values('" + mem.getId() + "','" + mem.getPw()
//				+ "','" + mem.getName() + "','" + mem.getRegDate() + "','" + mem.getSsn() + "')";
		int result = dao.insert(bean);
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
	public String update(MemberBean mem) {
		// 3수정
	String result = "";
	if (dao.update(mem) ==1) {
		result = "수정성공";
	} else {
		result = "수정실패";
	}	
	return result;
	}

	@Override
	public String delete(String id) {
		// 4삭제
		String result = "";
		if (dao.delete(id) ==1) {
			result = "삭제성공";
		} else {
			result = "삭제실패";
		}	
		return result;
		}

	@Override
	public int count() {
		// 컨트롤러에서 int count = service.count(); 만들고 서비스 / 임플 까지 타고 타고옴
		return dao.count();//토스
	}

	@Override
	public MemberBean findById(String findID) {
		// TODO Auto-generated method stub
//		MemberBean t = 
//		MemberBean t2 = new MemberBean(t.getId(),t.getPw(),t.getName(),t.getSsn());
		return dao.findById(findID);
	}

	@Override
	public List<MemberBean> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}

	@Override
	public List<MemberBean> findByName(String findName) {
		// TODO Auto-generated method stub
		return dao.findByname(findName);
	}
		
		
	}


