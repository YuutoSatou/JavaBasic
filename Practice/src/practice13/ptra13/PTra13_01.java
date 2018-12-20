/*
 * PTra13_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Animal; 			//import文の追加

public class PTra13_01 extends Animal {	//extends（継承)をする。

	/*
	 * ★ PTra13_01クラスはcommon.Animalクラスを継承してください
	 */

	public static void main(String[] args) {

		// ★ PTra13_01をインスタンス化をしてください

		PTra13_01 a1 = new PTra13_01();		//インスタンス化

		// ★ PTra13_01の持つsetterを実行してください（引数："人"）
		a1.setName("人");	//setterを実行

		// ★ PTra13_01の持つインスタンスメソッドrunとbreathを実行してしてください
		a1.run();			//メソッドの実行
		a1.breath();		//メソッドの実行

	}

}