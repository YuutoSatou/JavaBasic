package practice.practice18;

public class Employee {
	private String company;
	private String name;
	private int age;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

//答え合わせ済み(2018/12/25)
//社員を表すクラス「Employee」をアクセス修飾子public で作成してください。
//社員は、String型の「company」 、 「name」 、int型の「age」というフィールドを持っています。
//フィールドはすべてアクセス修飾子 private をつけて宣言してください。
//各フィールドにはアクセスするためのgetter, setterをそれぞれ用意してください。
