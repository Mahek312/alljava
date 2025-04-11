package java1;

class animalsuper{
    String color = "purple"; 
}
class dog extends animalsuper{
    String color = "Black";
    void print(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class animal{
public static void main(String[] args){
    dog d = new dog();
    d.print();
}
}
