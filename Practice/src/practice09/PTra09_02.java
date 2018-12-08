package practice09;

import practice09.util.Util;
/*
 * PTra09_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra09_02 {
	public static void main(String[] args) {
		String[] array = {"Plain", "Island", "Mountain", "Swamp", "Forest"};

		// ★ 配列arrayを、Util内のメソッドを用いてランダムに並び替えてください
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです
		String[] list = Util.shuffleArray(array);

		// ★ ランダムに並び替えた後の配列を前から順に全て表示してください
		for(int i = 0;i<array.length; i++){
			System.out.println(array[i]);
	}
}
}

//import文の記述方法がわからない。→解決（package practice09;の下に記述）
//１７行目の記述がわからない→解決
//２０行目はfor文で記述。スライドを見ながらやること。→解決
//１３行目の配列を２０行目でシャッフルされていれば、ＯＫ→解決
