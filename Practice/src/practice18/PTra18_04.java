package practice18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		FileReader fr = null;
		try {
			fr = new FileReader("file/BestElevenCandidate.csv");
		} catch (FileNotFoundException e1) {
			// TODO 自動生成された catch ブロック
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		entity et = new entity();								//et
		// TODO
		String line;
		ArrayList<Player> array = new ArrayList<Player>();		//ArrayList
		try {
			while((line = br.readLine()) !=null) {					//null
				String[] s = new String[4];							//s
				Player p = new Player();							//p
				s = line.split(",");								//split
				p.setPosition(s[0] + ",");							//Potiton
				p.setName(s[1] + ",");								//Name
				p.setCountry(s[2] + ",");							//Country
				p.setTeam(s[3] + ",");								//Team

				array.add(p);										//add

			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		Collections.shuffle(array);
		Collections.shuffle(array);
		Collections.shuffle(array);
		Collections.shuffle(array);


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		System.out.println(array.get(0));
		System.out.println(array.get(0));	    //4
		System.out.println(array.get(1));
		System.out.println(array.get(2));
		System.out.println(array.get(3));
		System.out.println(array.get(0));		//4
		System.out.println(array.get(1));
		System.out.println(array.get(2));
		System.out.println(array.get(3));
		System.out.println(array.get(1));		//1
		int gkCount = 0;
		int dfCount = 0;
		int mfCount = 0;
		int fwCount = 0;

		for(Player player : array){
			String position = player.getPosition();

			switch (position) {
			case "GK":
				if(gkCount < 1) {
					System.out.println(player);
					gkCount++;
				}
				break;
			case "DF":
				if(dfCount < 4) {
					System.out.println(player);
					dfCount++;
				}
				break;
			case "MF":
				if(mfCount < 4) {
					System.out.println(player);
					mfCount++;
				}
				break;
			case "FW":
				if(fwCount < 2) {
					System.out.println(player);
					fwCount++;
				}
				break;
			}
		}
	}
}