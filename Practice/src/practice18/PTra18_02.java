package practice18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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

	public static void main(String[] args){
		ArrayList<Player> array = new ArrayList<Player>();		//最初に定義
		try {
			/*
			 * entity.Playerの作成後に行ってください
			 *
			 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
			 * ★ ArrayListを作成して、Playerインスタンスを格納してください
			 */
		FileReader fr = null;


		fr = new FileReader("file/BestElevenCandidate.csv");	//csv
		BufferedReader br = new BufferedReader(fr);				//データの読み込みを行うためのクラス
		String line;											//変数ラインを定義
		while((line = br.readLine()) !=null) {					//nullでない場合は
				String[] s = new String[4];						//配列sを定義
				Player p = new Player();						//pインスタンス
				s = line.split(",");							//split
				p.setPosition(s[0]);							//Potiton
				p.setName(s[1]);								//Name
				p.setCountry(s[2]);							    //Country
				p.setTeam(s[3]);								//Team

				array.add(p);									//addメソッド

			}
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
		e.printStackTrace();
	      }


		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
				// ※ できれば拡張for文を使いましょう

		for(Player name : array){
            System.out.println(name);
        }
	}
}


//try-catchで記述しようとしたが、わからなくなってしまった。→解決(2018/12/26)
//コメント行を追加(2018/12/25)