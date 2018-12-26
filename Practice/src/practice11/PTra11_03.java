package practice11;

/*
 * PTra11_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_03 {

	/*
	 * ★ PTra11_03クラスに、クラスフィールドでint型のnumberを定義してください
	 */
	static int number; 			//staticで定義
	/*
	 * ★ PTra11_03クラスのコンストラクタを引数なしで定義してください
	 * ★ 処理は、クラスフィールドnumberに1を加算してください
	 */
	PTra11_03() {
		this.number ++;	//クラスフィールドnumberに1を加算してください
	}

	// ★ sumメソッドを呼び出してください
	public static void main(String[] args) {

		new PTra11_03().sum(5, 10);
	}
	public void sum(int x, int y) {
		System.out.println("sumメソッドを呼び出しました。" + x + "＋" + y + "＝" + (x + y));
		/* + ★ クラスフィールドnumberの出力をしてください */
		System.out.println("クラスフィールドnumber：" + this.number); //閉じる場所を間違えないこと。
	}
}

//よくわからない→解決
//	public static 戻り値の型 メソッド名 (引数) { }
//	メソッド名 (引数)