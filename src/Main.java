//
//class A{
//    void hello1(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println("A = "+i);
//            if(i == 5) {
//                try {
//                    Thread.sleep(5000);
//                } catch (Exception e) {
//                    System.out.println(i);
//                }
//
//            }
//        }
//    }
//}
//class B{
//    void hello2(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println( "B =" +i);
//        }
//    }
//}
//class C{
//    void hello3(){
//        for (int i = 0; i < 10; i++) {
//            System.out.println( "C =" +i);
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        A n1 = new A();
//        B n2 = new B();
//        C n3 = new C();
//
//        n1.hello1();
//        n2.hello2();
//        n3.hello3();
//
//    }
//}