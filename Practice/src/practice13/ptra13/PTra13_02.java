/*
 * PTra13_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;

public class PTra13_02 extends Hero {

	/*
	 * ★ common.Characterクラスを継承した、common.Heroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 */

	public static void main(String[] args) {
		// ★ common.Heroクラスをインスンタンス化してください
		Hero hero = new Hero();

		// ★ common.Heroインスタンスのnameに"勇者"を設定して下さい
		hero.setName("勇者");

		// ★ common.Heroインスタンスのキャラクター情報を表示してください

		System.out.println(hero.showParameter());

	}
}
//変数名をaからheroに変更した。


//子クラスから呼び出す場合はsuperをつける必要がある。
//このように、継承元の親のコンストラクタは、子クラスのコンストラクタの先頭で自動的に実行されます。
//これは、コンパイル時に先頭に super(); が自動的に挿入されるためです。
//hero.setName(Character);