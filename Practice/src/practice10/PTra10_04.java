package practice10;
/*
 * PTra10_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_04 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ User型の変数が3つ入る配列usersを宣言・確保してください
		User users[] = new User[3]; //配列の記述

		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
		java.util.Scanner scanner; //java.util.Scannerクラスをインスタンス化
		java.util.Scanner aaa = new java.util.Scanner(System.in);
		scanner = aaa; //変数scannerに代入

		// ★ usersのサイズ分繰り返す制御構文を記述してください
		//----------- ループ start
		for (int i = 0; i < users.length; i++) {
			System.out.println(i + 1 +"人目の情報を入力します"); /* ##には、カウントを入れてください */
			System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

			// ★ コマンドプロンプトに入力された値を、String型の変数lineに格納してください
			String line = scanner.nextLine();

			// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
			String aa[] = line.split(","); //splitを用いる。

			// ★ 配列にした値を、users[カウント]の各フィールドに代入してください
			// ★ ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
			users[i] = new User();	//newを記載。
			users[i].userId = Integer.parseInt(aa[0]);
			users[i].userNm = aa[1];
			users[i].mail = aa[2];
			users[i].password = aa[3];
		}

		//----------- ループ end

		// ★ usersに格納されている全てのインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
		for (int i = 0; i < users.length; i++) {
			System.out.println(users[i].userId);
			System.out.println(users[i].userNm);
			System.out.println(users[i].mail);
			System.out.println(users[i].password);
		}
	}
}
//全てのインスタンスの、フィールドuserId, userNm, mail, passwordを出力してくださいとは？
//for文を作る。
//３９行目　ヒント：配列の中にインスタンス　クラス型のスライドをもう一度見る
//型名 配列変数名[];
//インスタンスを作成１行、代入１行