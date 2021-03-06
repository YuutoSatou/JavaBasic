///*
// * PTra17_04.java
// *   作成	LIKEIT	2017
// *------------------------------------------------------------
// * Copyright(c) Rhizome Inc. All Rights Reserved.
// */
//package practice17.ptra17;
//
//public class PTra17_04 {
//	public static void main(String[] args) {
//
//		String str = "スッキリわかるJava入門";
//
//		/*
//		 * strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
//		 * ※ Thread.sleep を使用すること
//		 */
//		char[] charArray = str.toCharArray();		//charArrayに入れる
//		for (char ch : charArray) {				//拡張for文
//			System.out.print(ch);					//chを出力
//			try {
//				Thread.sleep(250);					//Thread.sleepを使用
//			} catch (InterruptedException e) {
//			}
//		}
//	}
//}

package practice17.ptra17;

public class PTra17_04 {
	public static void main(String[] args) {

		String str = "スッキリわかるJava入門";

		/*
		 * ★ strに入っている文字列を1文字ずつゆっくり表示させるプログラムを完成させてください
		 * ※ Thread.sleep を使用すること
		 */
		for (int i = 0; i <= str.length() - 1; i++) {			//for文を追記
			try {

				Thread.sleep(250); 							//3000ミリ秒Sleepする

			} catch (InterruptedException e) {
			}
			System.out.println(str);

		}
	}
}

//期待通りの結果が得られなかった。
//Threadクラスで用意されているsleepメソッドを使うことで、
//指定した時間だけスレッドを一時停止させることが出来ます。