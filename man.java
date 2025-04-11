package java1;
class animal{
    void show(){
        System.out.println("show from superclass");
    }
    void display(){
        System.out.println("display");
    }
class dog extends animal{
    void show(){
        System.out.println("show from subclass");
    }
    void print(){
        System.out.println("print");
    }
} 
public class man{
    public static void main(String[] args){
        dog d = new dog();
        d.show();
        d.display();
    }
}   
}
