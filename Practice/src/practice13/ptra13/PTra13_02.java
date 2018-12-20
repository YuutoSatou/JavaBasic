/*
 * PTra13_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import common.Hero;

public class PTra13_02 extends Hero {

	/*
	 * ★ common.Characterクラスを継承した、common.Heroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 */

	// TODO 自動生成されたコンストラクター・スタブ

	public static void main(String[] args) {
		// ★ common.Heroクラスをインスンタンス化してください
		Hero a = new Hero();

		// ★ common.Heroインスタンスのnameに"勇者"を設定して下さい
		a.setName("勇者");

		// ★ common.Heroインスタンスのキャラクター情報を表示してください

		System.out.println(a.showParameter());

	}
}

//子クラスから呼び出す場合はsuperをつける必要がある。
//このように、継承元の親のコンストラクタは、子クラスのコンストラクタの先頭で自動的に実行されます。
//これは、コンパイル時に先頭に super(); が自動的に挿入されるためです。
//a2.setName(Character);