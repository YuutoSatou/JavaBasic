/*
 * PTra16_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_03 {

	/*
	 * toStringメソッドをオーバーライドしてください
	 *
	 * 処理内容
	 * 	・親クラス（Objectクラス）のtoStringの処理を行ってください
	 *	・その後、改行をして「PTra16_03#toString()の処理」という文字列を連結してください
	 */

    @Override
    public String toString() {	//オーバーライドする
        return super.toString() + "\nPTra16_03#toString()の処理";//親クラス（Objectクラス）のtoStringの処理
    }

    public static void main(String[] args) {

        // PTra16_03クラスのtoStringメソッドの内容を出力してください
        System.out.println(new PTra16_03().toString());
    }
}

//オーバーライドとはクラスを継承する時に、スーパークラスのメソッドをサブクラスにおいて、
//同じメソッド名で定義し直すことを言います。
//オーバーライドする際には、メソッド名を同じにする引数は、同じ数、同じ順番にする必要があります。