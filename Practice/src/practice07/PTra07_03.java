package practice07;
/*
 * PTra07_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_03 {
	public static void main(String[] args) {

		// ★ char型の配列keywordを定義し 「'平', '島', '沼', '山', '森'」 で初期化してください
		char keyword[] = { '平', '島', '沼', '山', '森' };

		// ★ 配列keywordに格納されている値を後ろから順番に全て表示してください
		System.out.println(keyword[4]);
		System.out.println(keyword[3]);
		System.out.println(keyword[2]);
		System.out.println(keyword[1]);
		System.out.println(keyword[0]);
	}
}

//char 変数名[] = { 文字, 文字, 文字 }; // 宣言と同時に代入する。（初期化）
//自力で解けた。