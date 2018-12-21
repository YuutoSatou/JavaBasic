/*
 * PTra18_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_01 {
	public static void main(String[] args) {

		// file/BestElevenCandidate.csv に記述された文字列を1行毎に line に代入します。
		ArrayList<String> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();

				// ★ 1行ごとにArrayListに格納してください
				array.add(line);
				//                ArrayList<Integer> list = new ArrayList<Integer>();
				//                list.add(10);
				//                list.add(100);
				//                list.add(200);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}
		for (String name : array) {
			System.out.println(name.replaceAll(",", "\t"));
		}
		//                }
		//                }

		// ★ ArrayListに格納された値を全て表示してください
		// ※ できれば拡張for文を使いましょう

		//        for (データ型 変数名: コレクション){
		//        	  実行する文1;
		//        	  実行する文2;
		//        	  ...
		//        	}

	}
}

//演習問題を解けばわかる。
//1行ごとにArrayListに格納してくださいとは？
//この場合の拡張for文とは？→解決