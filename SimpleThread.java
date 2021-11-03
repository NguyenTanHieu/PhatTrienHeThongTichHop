public class SimpleThread extends Thread{
    public void run(){
        System.out.println("luong dang chay...");
    }
    public static void main(String[] args) {
        SimpleThread t= new SimpleThread();
        t.start();
    }
}
