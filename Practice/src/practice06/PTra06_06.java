package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 */
		for (int i = 0; i < 5; i++) {		//縦の列
			for (int j = 0; j < 5; j++) {
				if(j<i) {
					System.out.print("■"); //横の列
				} else {
					System.out.print("□");
				}
			}
			System.out.println(""); // 改行
		}
	}
}
//わからない（for文を追加してみたが、無限ループになってしまった。）→解決済み。