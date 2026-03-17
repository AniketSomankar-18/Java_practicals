import java.util.Scanner;

class Vehicle{
		String color;
		int modelNumber;
		String brandName;
		
		void inputDetails(){
		    Scanner sc= new Scanner(System.in);
		    System.out.println("Enter Car Details");
		    System.out.println("Enter Brand Name:");
		    brandName = sc.nextLine();
		    
        System.out.println("Enter Model Number:");
		    modelNumber = sc.nextInt();
		    
		    System.out.println("Enter Car Color:");
		    color = sc.nextLine();
		    
		    color = sc.nextLine();
		  
		    sc.close();
		}
		
}

class Car extends Vehicle{

    void displayDetails(){
        System.out.println("Car Details");
        System.out.println("Car Brand Name:"+super.brandName);
        System.out.println("Car Model Number:"+super.modelNumber);
        System.out.println("Car Color:"+super.color);
    }

    public static void main(String[] args){
        Car car1 = new Car();
        car1.inputDetails();
        car1.displayDetails();
    }

}
