


public class Main5 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Test Main");
        System.out.println(Thread.currentThread().getName());

    }
}
