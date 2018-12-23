/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		FileReader fr = new FileReader("file/BestElevenCandidate.csv");
		BufferedReader br = new BufferedReader(fr);
		entity et = new entity();								//et インスタンス
		String line;											//lineを定義
		ArrayList<Player> array = new ArrayList<Player>();		//ArrayList
		while((line = br.readLine()) !=null) {					//nullではない場合は。
			String[] s = new String[4];							//s配列
			Player p = new Player();							//p  インスタンス
			s = line.split(",");								//splitを使用
			p.setPosition(s[0] + ",");							//Potiton
			p.setName(s[1] + ",");								//Name
			p.setCountry(s[2] + ",");							//Country
			p.setTeam(s[3] + ",");								//Team

			array.add(p);										//addメソッド

		}

		Collections.shuffle(array0);
		Collections.shuffle(array1);
		Collections.shuffle(array2);
		Collections.shuffle(array3);



		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		System.out.println(array0.get(0));
		System.out.println(array1.get(0));	    //4名
		System.out.println(array1.get(1));
		System.out.println(array1.get(2));
		System.out.println(array1.get(3));
		System.out.println(array2.get(0));		//4名
		System.out.println(array2.get(1));
		System.out.println(array2.get(2));
		System.out.println(array2.get(3));
		System.out.println(array3.get(1));		//1名

	}
}

//途中まで20181223
