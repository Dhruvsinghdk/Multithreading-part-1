//
//class A extends Thread {
//
//    public void run() {
////        for (int i = 0; i < 10; i++) {
////            if (i == 5) {
////                try {
////                    Thread.sleep(4000);
////                } catch (Exception e) {
////                    System.out.println("A = " + i);
////                }
////            }
////                System.out.println("A = " + i);
//            System.out.println("A = ");
//        }
//    }
//}
//
//
//class B extends Thread{
//    public void run(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println( "B =" +i);
//        }
//    }
//}
//class C extends Thread {
//    public void run(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println( "C =" +i);
//        }
//    }
//}
//public class Main2 {
//    public static void main(String[] args) throws Exception{
//        A n1 = new A();
//        B n2 = new B();
//        C n3 = new C();
//
//        n1.start();
//
//        n2.start();
//
//        n3.start();
//
//    }
//}
