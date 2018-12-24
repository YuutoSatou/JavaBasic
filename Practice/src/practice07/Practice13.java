package practice07;

public class Practice13 {
	public static void main(String[] args) {
		// 表を2次元配列で初期化する
		int[][] scoreList = {
				{ 95, 88, 87 },
				{ 70, 81, 100 },
				{ 12, 98, 90 },
				{ 100, 100, 100 } //追加
		};
		// それぞれのスコアを出力
		System.out.println(scoreList[0][0] + scoreList[0][1] + scoreList[0][2]);
		System.out.println(scoreList[1][0] + scoreList[1][1] + scoreList[1][2]);
		System.out.println(scoreList[2][0] + scoreList[2][1] + scoreList[2][2]);
		System.out.println(scoreList[3][0] + scoreList[3][1] + scoreList[3][2]); //追加
	}
}