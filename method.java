package java1;
class method {
    static int display(int a){
        System.out.println("value of a:"+a);
    }
    void display(int a,int b){
        System.out.println("value of a and b:" +a+ "and" +b);
    }
    public static void main(String[] args){
        display(5);
        method obj = new method();
        obj.display(5,8);
    }
    
}
