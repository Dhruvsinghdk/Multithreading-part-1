


public class Main3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
       Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getPriority());
    }
}
