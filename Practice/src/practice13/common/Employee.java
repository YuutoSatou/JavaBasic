package practice13.common;

public class Employee extends Person {
	private String departmentNm;
	private int departmentCnt;

	public String getDepartmentNm() { //departmentNm get
		return this.departmentNm;
	}

	public void setDepartmentNm(String departmentNm) { //departmentNm set
		this.departmentNm = departmentNm;
	}

	public int getDepartmentCnt() { //departmentCnt get
		return this.departmentCnt;
	}

	public void setDepartmentCnt(int departmentCnt) //departmentCnt set
	{
		this.departmentCnt = departmentCnt;
	}
}

//完成