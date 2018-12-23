package practice18;

import java.util.ArrayList;
public class Test18{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add( "山田太郎");
        list.add( "小林次郎");
        list.add( "佐藤三郎");
        for(String name : list){
            System.out.println(name);
        }
    }
}



//public class Test18 {

//import java.util.ArrayList;



//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class Test18 {
//    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("山田太郎");
//        list.add("小林次郎");
//        list.add("佐藤三郎");
//        for (Iterator<String> it = list.iterator(); it.hasNext();) {
//            String name = it.next();
//            System.out.println(name);
//        }
//    }
//}


//public class Test18 {
//	//    public static void main(String[] args) {
//	//        ArrayList<String> list = new ArrayList<String>();
//	//        list.add("山田太郎");
//	//        list.add("小林次郎");
//	//        list.add("佐藤三郎");
//	//        for(int i = 0;i < list.size();i++){
//	//            System.out.println(list.get(i));
//	//        }
//	//    }
//
//
//}
