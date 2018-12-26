package entity;

public class Player {
	//position
	private String position;

	//name
	private String name;

	//country
	private String country;

	//team
	private String team;

	//position

	public String getPosition() { //get
		return this.position;
	}

	public void setPosition(String positon) { //set
		this.position = position;
	}

	//name

	public String getName() { //get
		return this.name;
	}

	public void setName(String name) { //set
		this.name = name;
	}

	//country

	public String getCountry() { //get
		return this.country;
	}

	public void setCountry(String country) { //set
		this.country = country;
	}

	//team

	public String getTeam() { //get
		return this.team;
	}

	public void setTeam(String team) { //set
		this.team = team;
	}

	@Override
	public String toString() {	//toStringメソッドをオーバーライド
		return this.position + "," + this.name + "," + this.country + "," + this.team;	//区切る
	}
}
//完成(2018/12/25)

//バックアップ
//package entity;
//
//public class Player {
//
//	/*
//	 * フィールド
//	 * 		position	：	String
//	 * 		name		：	String
//	 * 		country		：	String
//	 * 		team		：	String
//	 * メソッド
//	 * 		各アクセサ
//	 *
//	 * 		toString()	：	Objectクラスのオーバーライド
//	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
//	 */
//	String name;
//
//	String country;
//
//	String team;
//
//	private Object position;
//
//	public void setPosition(String positon, Object position) {
//		this.position = position;
//	}
//
//	public String getPosition() {
//		return (String) this.position;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return this.name;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public String getCountry() {
//		return this.country;
//	}
//
//	public void setTeam(String team) {
//		this.team = team;
//	}
//
//	public String getTeam() {
//		return this.team;
//	}
//
//	@Override
//	public String toString() {
//		return this.position + "," + this.name + "," + this.country + "," + this.team;
//	}
//}