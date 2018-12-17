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
	int number;
	/*
	 * ★ PTra11_03クラスのコンストラクタを引数なしで定義してください
	 * ★ 処理は、クラスフィールドnumberに1を加算してください
	 */

	 // コンストラクタ
//	PTra11_03() {
//        this.name = "たま";
//        this.owner = "佐川真司";
//        System.out.println(owner + "の" + name);
//    }




//	public static void main(String[] args) {

		// ★ sumメソッドを呼び出してください

//		sum();

	public void sum(int x, int y) {
		System.out.println("sumメソッドを呼び出しました。" + x + "＋" + y + "＝" + (x + y));

		System.out.println("クラスフィールドnumber：" /* + ★ クラスフィールドnumberの出力をしてください */);
	}
}

//よくわからない。

//	public static 戻り値の型 メソッド名 (引数) { }
//	メソッド名 (引数)
//for(int i=0;i<number.length;i++) {
//}