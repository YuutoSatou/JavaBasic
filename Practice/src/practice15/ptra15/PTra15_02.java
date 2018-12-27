/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Java2Month;
import practice15.common.Room;

public class PTra15_02 extends Java2Month{  			//継承
	public static void main(String[] args) {

		Room room = new Java2Month();

		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください
		Java2Month j2m = (Java2Month)room;				//roomに格納されたJava2Monthインスタンス
		String[] curriculum = j2m.getCurriculum();		//getCurriculumメソッドを呼び出し

		// 取得したカリキュラム情報を全て出力してください
		for (String str : curriculum) {		//拡張for文
			System.out.println(str);		//出力
		}
	}
}


