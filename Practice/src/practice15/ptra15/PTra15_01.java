/*
 * PTra15_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Course;
import practice15.common.DBCourse;
import practice15.common.JavaCourse;

public class PTra15_01 {

	public static void main(String[] args) {

		JavaCourse jCourse = new JavaCourse();
		DBCourse dbCourse = new DBCourse();

		// ★ Course[	]の配列に jcourse と dbCourse のインスタンスを代入してください。




		// ① int[] 型の 配列 score を作成
		JavaCourse[] Course;
		// ② 要素を5つ作って、変数 score に代入する。
		Course = new JavaCourse[5];
		Course[0] = new JavaCourse();

		DBCourse[] Course1;
		Course1 = new DBCourse[5];
		Course1[0] = new DBCourse();

		Object courseList;
		for (Course course : courseList) {
			System.out.println(course.getCourseName());
		}
	}

}
//ただ単純に配列にインスタンスを代入する。
//難しい。