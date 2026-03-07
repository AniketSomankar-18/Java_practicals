import java.util.Scanner;

class Book {
    int bookId;
    String title;
    boolean issued;
    String regNo;
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[20];
        int count = 0;
        int choice;

        do {

            System.out.println("\n------ Library Management System ------");
            System.out.println("1. Add New Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    books[count] = new Book();

                    System.out.print("Enter Book ID: ");
                    books[count].bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    books[count].title = sc.nextLine();

                    books[count].issued = false;
                    count++;

                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    sc.nextLine();

                    for(int i = 0; i < count; i++) {
                        if(books[i].bookId == issueId && !books[i].issued) {

                            System.out.print("Enter Student Registration No: ");
                            books[i].regNo = sc.nextLine();

                            books[i].issued = true;

                            System.out.println("Book issued successfully.");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();

                    for(int i = 0; i < count; i++) {
                        if(books[i].bookId == returnId && books[i].issued) {

                            books[i].issued = false;
                            books[i].regNo = null;

                            System.out.println("Book returned successfully.");
                            break;
                        }
                    }
                    break;

                case 4:
                    for(int i = 0; i < count; i++) {

                        System.out.println("\nBook ID: " + books[i].bookId);
                        System.out.println("Title: " + books[i].title);

                        if(books[i].issued) {
                            System.out.println("Issued to Reg No: " + books[i].regNo);
                        } else {
                            System.out.println("Available");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } 
        
        while(choice != 5);

        sc.close();
    }
}
