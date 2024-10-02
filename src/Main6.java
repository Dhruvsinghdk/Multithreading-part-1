
class A extends Thread {

    public void run() {
//        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Thread A");
        System.out.println(Thread.currentThread().getName());
    }
}


class B extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
class C extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class Main6 {
    public static void main(String[] args) throws Exception{

        A n1 = new A();
        B n2 = new B();
        C n3 = new C();

        n1.start();
        n2.start();
        n3.start();





    }
}
