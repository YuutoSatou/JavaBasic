package practice16;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
 */

public class PTra16_01 {
	public static void main(String[] args) {

		/*
		* ★ 現在時刻を「YYYY年MM月DD日」形式で出力してください
		*/
		// 日付を読みやすい文字列形式で表示する
		Date date = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日");
		String dateStr = f.format(date);
		System.out.println(dateStr);
	}
}
//自力で解けた。
//スライド17-3を読んで解く。