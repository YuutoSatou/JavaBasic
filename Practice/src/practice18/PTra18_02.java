/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import entity.Player;

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
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

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう

		for(Player name : array){
            System.out.println(name);
        }



	}
}

//entity.Playerクラスを作ろうとするとエラーが発生する。→解決
//toStringメソッド
//public String toString() {
//	return "[" + this.name + ":" + this.cryCount + "]";