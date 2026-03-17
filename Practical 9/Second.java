class Employee{
    
    int employeeID=101;
    String name = "Aniket";
    int age = 27;
    double salary = 45000.97;
}

class Manager extends Employee{
    void displayDetails(){
        System.out.println("Employee ID:"+employeeID);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Age:"+age);
        System.out.println("Employee Salary:"+salary);
    }
}

class Assistant extends Manager{
    
    public static void main(String[] args){
        Assistant a1 = new Assistant();
        a1.displayDetails();
    }
}
    
