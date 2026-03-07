import java.util.Scanner;

class Student {
    String name;
    String regNo;
    int contactNo;
}

public class SMS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[100]; 
        int count = 0;
        int choice;

        do {

            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                s[count] = new Student();

                System.out.print("Enter Name: ");
                s[count].name = sc.nextLine();

                System.out.print("Enter Reg No: ");
                s[count].regNo = sc.nextLine();

                System.out.print("Enter Contact No: ");
                s[count].contactNo = sc.nextInt();

                count++;

            } 
            else if (choice == 2) {

                for (int i = 0; i < count; i++) {
                    System.out.println("\nName: " + s[i].name);
                    System.out.println("Reg No: " + s[i].regNo);
                    System.out.println("Contact No: " + s[i].contactNo);
                }

            }

        } 
        
        while (choice != 3);

        sc.close();
    }
}
