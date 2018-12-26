/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		ArrayList<Player> array = new ArrayList<Player>();

		try {
			/*
			 * entity.Playerの作成後に行ってください
			 *
			 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
			 * ★ ArrayListを作成して、Playerインスタンスを格納してください
			 */
		FileReader fr = null;


		fr = new FileReader("file/BestElevenCandidate.csv");
		BufferedReader br = new BufferedReader(fr);				//データの読み込みを行うためのクラス
		String line;											//変数ラインを定義
		while((line = br.readLine()) !=null) {					//nullでない場合は
				String[] s = new String[4];							//配列sを定義
				Player p = new Player();							//pインスタンス
				s = line.split(",");							//split
				p.setPosition(s[0]);							//Potiton
				p.setName(s[1]);								//Name
				p.setCountry(s[2]);							    //Country
				p.setTeam(s[3]);								//Team

				array.add(p);										//addメソッド

			}
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
		e.printStackTrace();
	      }

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		for(int i = array.size()-1;0<=i;i--) {
			Player player = array.get(i);				//iを取得
			String team = player.getTeam();				//teamを取得
			if("レアル・マドリード".equals(team)||"バルセロナ".equals(team)) {
				array.remove(i);
			}
		}

		// ★ 削除後のArrayListの中身を全件出力してください
		for(Player name : array){
            System.out.println(name);
        }


	}
}

//自力で解けた。(2018/12/26)
//全件出力は、18-2と同じ。