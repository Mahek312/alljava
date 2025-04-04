package java1;

public class third {
    

        String model;
        int year;
     third(String m, int y) {
            model = m;
            year = y;
        }
      void displayCarDetails() {
            System.out.println("Car Model: " + model);
            System.out.println("Car Year: " + year);
        }
         public static void main(String[] args) {
            third myCar = new third("maruti", 2020);
            myCar.displayCarDetails();
        
    }
    
}

