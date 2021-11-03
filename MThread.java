public class MThread extends Thread{
    String name;
    int n;
    MThread(String name, int n){
           this.name= name;
           this.n=n;
           System.out.println(name +"has been created....");
           start();
    }
    public void run(){
        for(int i=0;i<n;i++){
            System.out.println("Hello ,i am"+name);
        System.out.println("i go to bed"+i);
    }
}
public static void main(String[] args) {
    int n=10000;
    int nt=4;
    for(int i=0; i<nt ;i++){
MThread t= new MThread("Thread: "+i, n);
    }
}
}