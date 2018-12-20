/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import common.Hero;
import practice13.common.Slime;
import practice13.ptra13.PTra13_05.common;

public class PTra13_04 extends common {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		Hero a = new Hero();
		Slime b = new Slime();
		a.setName("勇者");
		b.setName("スライム");

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		boolean heroWin = true;
		while (true) {

			// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」

		}
	}
}