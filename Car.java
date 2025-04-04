package java1;

public class Car {
    
        String model;
        int year;
     Car(String m, int y) {
            model = m;
            year = y;
        }
      void displayCarDetails() {
            System.out.println("Car Model: " + model);
            System.out.println("Car Year: " + year);
        }
         public static void main(String[] args) {
            Car myCar = new Car("Toyota", 2020);
            myCar.displayCarDetails();
        
    }
    
}
