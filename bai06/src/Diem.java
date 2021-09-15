public class Diem {
    int x,y;
    void nhaptoado(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    void intoado(){
        System.out.println("("+x +"," +y+")");
    }
    double khoangcach(int x, int y)
    {
        double kq=Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
        return kq;
        
    }
    public static void main(String[] args) {
        Diem d1=new Diem();
        Diem d2=new Diem();

        d1.nhaptoado(6, 11);
        d2.nhaptoado(4, 7);

        d1.intoado();
        d2.intoado();

        System.out.println("Khoang cach : "+d1.khoangcach(4, 2));
    }
}
