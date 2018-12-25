package practice13.common;

public class Item {

	/*
	 * ★ common.Itemクラスを作成してください
	 *
	 * フィールド
	 * 		name	:	String
	 * 		additionalDamage	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 * コンストラクタ
	 * 		name, additionalDamageに初期値を設定するコンストラクタ
	 * 		上記2つを設定するための引数を持つ
	 */

	private String name;
	private int additionalDamage;

	public String getName() { //name get
		return this.name;
	}

	public void setName(String name) { //name set
		this.name = name;
	}

	public int getAdditionalDamage() { //additionalDamage get
		return this.additionalDamage;
	}

	public void setAdditionalDamage(int additionalDamage) //additionalDamage set
	{
		this.additionalDamage = additionalDamage;
	}
}

//各フィールドのアクセサまで記述した。(2018/12/25)
//コンストラクタ未作成。
