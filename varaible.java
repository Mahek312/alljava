package java1;

public class varaible {
    int a=10;
    static int b=50;
    public static void main(String[] args){
        varaible obj = new varaible();
        System.out.println(obj.a);
        System.out.println(b);
        obj.method();
    }
    public void method(){
        int d = 30;
        double e = 9.8;
        System.err.println(d);
        System.out.println(e);
    }
}
