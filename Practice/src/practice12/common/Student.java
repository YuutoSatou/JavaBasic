/*
 * Student.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice12.common;

/**
 * 受講生の情報を格納します
 * @author Rhizome
 *
 */
public class Student {
	/** 受講生ID */
	private int studentId;

	/** 受講生氏名 */
	private String studentName;

	/** 会社名 */
	private String companyName;

	/** 教室名 */
	private String className;

	/** メールアドレス */
	private String mail;

	/** パスワード */
	private String password;

	//studentd
	public int getstudentId() {
		return studentId;
	}

	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}

	//stundentName
	public String getstudentName() {
		return studentName;
	}

	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}

	//companyName
	public String getcompanyName() {
		return companyName;
	}

	public void setcompanyName(String companyName) {
		this.companyName = companyName;
	}

	//className(教室名)
	public String getclassName() {
		return className;
	}

	public void setclassName(String className) {
		this.className = className;
	}

	//mail
	public String getmail() {
		return mail;
	}

	public void setmail(String mail) {
		this.mail = mail;
	}

	//password
	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
}
//以下　例
//public String getCompany() {
//    return company;
//}
//public void setCompany(String company) {
//    this.company = company;
//}
//public String getName() {
//    return name;
//}
//public void setName(String name) {
//    this.name = name;
//}
//public int getAge() {
//    return age;
//}
//public void setAge(int age) {
//    this.age = age;
