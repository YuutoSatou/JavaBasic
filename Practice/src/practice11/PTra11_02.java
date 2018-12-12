package practice11;

import java.util.Scanner;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		class ReadFileClass {
			boolean readBookDataFile() {
				System.out.println("探したい本のタイトル（又はその一部）を入力してください");
				return true;
			}
			// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください

			// 入力型プログラムです。
			// 下記の命令は、入力型プログラムで必要な記述になります。
			java.util.Scanner scanner = new java.util.Scanner(System.in);

			System.out.println("文字を入力してください");

			// コマンドプロンプトで入力した文字列が変数lineに代入されます
			String line = scanner.nextLine();
		if () {
				System.out.println("");
			} else {
				System.out.println("本情報のタイトル一部に含まれていません");
			}

		}
	}
}

//eqaulsメソッドを使うのか？
//staticは、インスタンスがある場合は使用しない。