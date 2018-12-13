package practice11;

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		Book[] booklist = FileReaderClass.readBookDataFile();

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください

		System.out.println("文字を入力してください");


		// コマンドプロンプトで入力した文字列が変数lineに代入されます
		String input = new java.util.Scanner(System.in).nextLine();
		//キーボードから一行の文字列の入力を受け付ける。（自分用）
		for (int i = 0; i < booklist.length; i++) {
			if (booklist[i].title.contains(input)) {
				System.out.println(booklist[i].dispBookInfo());
			}

		}

	}
}

//解けた。

//eqaulsメソッドを使うのか？→使わない。
//staticは、インスタンスがある場合は使用しない。
//入力型プログラムです。

// 下記の命令は、入力型プログラムで必要な記述になります。
//			java.util.Scanner scanner = new java.util.Scanner(System.in);

//String line = scanner.nextLine();
//if () {
//	System.out.println("");
//} else {
//	System.out.println("本情報のタイトル一部に含まれていません");
//}