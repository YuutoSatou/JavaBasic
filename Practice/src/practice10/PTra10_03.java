package practice10;
/*
 * PTra10_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_03 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// Userクラスを作成後に着手してください
		// ★ User型の変数usを宣言してください
		User us;

		// ★ 変数usに、Userクラスのインスタンスを作成・代入してください
		User u2 = new User();
		us = u2;

		System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		java.util.Scanner scanner; //java.util.Scannerクラスをインスタンス化
		java.util.Scanner aaa = new java.util.Scanner(System.in);
		scanner = aaa; //変数scannerに代入

		// ★ 入力された値を、String型の変数lineに格納してください
		String line = scanner.nextLine();
		// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）

		String aa[] = line.split(","); //splitを用いる。

		// ★ 配列にした値を、usの各フィールドに代入してください
		// ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
		us.userId = Integer.parseInt(aa[0]); //userIdは数値であるため。
		us.userNm = aa[1];
		us.mail = aa[2];
		us.password = aa[3];

		// ★ 変数usに格納されているインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
		System.out.println(us.userId);
		System.out.println(us.userNm);
		System.out.println(us.mail);
		System.out.println(us.password);

	}
}

//27行目のやり方がわからない。→解決
//sampleBクラスをインスタンス化する（例）→解決
//sampleB aaa = new sampleB();　　 （例）