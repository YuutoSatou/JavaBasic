package practice03;

//演習1.
//ファイル名	：Practice8.java
//課題内容	： 以下プログラムを作成してください。
//変数 num を宣言して、1 ~ 9 までの好きな数値を代入する。
//変数 num  が 1 から 3 のときは 「おはようございます。」を出力する。
//変数 num  が 4 から 6 のときは 「こんにちは。 」を出力する。
//変数 num  が 7 から 9 のときは 「こんばんは。 」を出力する。

public class Practice8 {
	public static void main(String[] args) {
		int num = 3;
		if (num <= 3) {
			System.out.println("おはようございます。");
		} else if (num <= 6) {
			System.out.println("こんにちは。");
		} else {
			System.out.println("こんばんは。");
		}

	}

}
