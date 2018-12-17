package practice01;


//スライド18-14
//public class test {
//    public static void main(String[] args) {
//        try {
//            System.out.println(numCheck(10));
//            System.out.println(numCheck(-2));
//
//        } catch (RuntimeException e) {
//            System.out.println("RuntimeExceptionが発生しました");
//        }
//    }
//
//    public static int numCheck(int num) {
//        if (0 > num) {
//            throw new RuntimeException();
//        }
//        return num;
//    }
//}

//スライド18-4
//public class test {
//    public static void main(String[] args) {
//        try {
//            int[] array = new int[3];
//            array[0] = 10;
//            System.out.println("0番目の箱に代入処理");
//            array[1] = 20;
//            System.out.println("1番目の箱に代入処理");
//            array[2] = 30;
//            System.out.println("2番目の箱に代入処理");
//            array[3] = 40;
//            System.out.println("3番目の箱に代入処理");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("例外を検知しました");
//        }
//    }
//}
