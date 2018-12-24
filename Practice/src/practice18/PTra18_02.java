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
		try {
			/*
			 * entity.Playerの作成後に行ってください
			 *
			 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
			 * ★ ArrayListを作成して、Playerインスタンスを格納してください
			 */
		FileReader fr = null;


		fr = new FileReader("file/BestElevenCandidate.csv");
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(br);
		entity et = new entity();									//et �C���X�^���X
		String line;												//line���`
		ArrayList<Player> array = new ArrayList<Player>();			//ArrayList

			while((line = br.readLine()) !=null) {					//null�ł͂Ȃ��ꍇ�́B
				String[] s = new String[4];							//s�z��
				Player p = new Player();							//p  �C���X�^���X
				s = line.split(",");								//split���g�p
				p.setPosition(s[0] + ",");							//Potiton
				p.setName(s[1] + ",");								//Name
				p.setCountry(s[2] + ",");							//Country
				p.setTeam(s[3] + ",");								//Team

				array.add(p);										//add���\�b�h

			}
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
}