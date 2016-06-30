package grade;

public class GradeBean {
	private int kor, eng, math;
	private String name;// 게터 세터는 이것들로

	

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return this.kor;
	}

	public int getEng() {
		return this.eng;
	}

	public int getMath() {
		return this.math;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "이름 : "+this.name+"국어"+this.kor+"영어"+this.eng+"수학"+this.math;
	}

}
