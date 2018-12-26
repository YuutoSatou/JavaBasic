/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		Player a = new Player();									//Playerインスタンス

		ArrayList<String> array = new ArrayList<String>();			//ArrayList
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				// ★ 1行ごとにArrayListに格納してください
				array.add(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		Collections.addAll(array, "レアル・マドリード", "バルセロナ");

		// ★ 削除後のArrayListの中身を全件出力してください
		System.out.println(ArrayList[]);


	}
}

//途中まで。2018/12/23