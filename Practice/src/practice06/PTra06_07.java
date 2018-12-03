package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
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
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */

		for (int i = 0; i < 6; i++) {		//縦の列
			for (int j = 0; j < 5; j++) {	//横の列
				if(j<i) {
					System.out.print("■");
				} else {
					System.out.print("□");
				}
			}
			System.out.println(""); // 改行
			}
		for (int i = 6; i < 10; i++) {		//縦の列
			for (int j = 0; j < 5; j++) {	//横の列
				if(j<i) {
					System.out.print("□");
				} else {
					System.out.print("■");
				}
			}
			System.out.println(""); // 改行
			}

	}
	}
//わからない
//縦１０マス横５マスにする。