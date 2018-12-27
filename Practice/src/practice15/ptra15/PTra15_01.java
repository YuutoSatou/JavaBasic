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
		Course[] courseList = new Course[2];	//箱を２つ用意
		courseList[0] = jCourse;				//一つ目に入れる
		courseList[1] = dbCourse;				//二つ目に入れる

		for (Course course : courseList) {					//正解
			System.out.println(course.getCourseName());		//正解
		}
	}

}
//ただ単純に、配列にインスタンスを代入する。→解決