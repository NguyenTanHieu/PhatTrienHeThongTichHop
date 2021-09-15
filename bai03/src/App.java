import java.util.Scanner;
public class App {
    static Scanner sc= new Scanner(System.in);
  public static void main(String[] args) {
      System.out.println("Chuong trinnh giai phuong trinh bac hai: ");
      System.out.print("a= ");
      float a=sc.nextInt();
      System.out.print("b= ");
      float b=sc.nextInt();
      System.out.print("c= ");
      float c=sc.nextInt();
      float x1,x2;
      if(a==0.0){
          if(b==0.0)
          System.out.println("phuong trinh vo nghiem");
          System.out.println("phuong trinh có nghiem:x="+(float)-c/b);
      }else{
          float delta= b*b -4*a*c;
          if(delta>0){
              x1=(float) ((-b+ Math.sqrt(delta)) / (2*a));
              x2=(float) ((-b+ Math.sqrt(delta)) / (2*a));
              System.out.println("phuong trinh co 2 nghiem phan biet:\nx1="+ (float)x1+"\nx2"+(float)x2);
      }else if(delta==0){
          x1=(-b/(2*a));
          System.out.println("phuong trinh co nghiep kep :\nx1="+(float)x1);
      }else{
          System.out.println("phuong trinh vo nghiem");
      }
     
     
    }
}
}

