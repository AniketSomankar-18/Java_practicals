class Student{
    static String collegeName;
    String studentName;
    int studentId;
    int age;
    String course;
    static int counter = 1;

    static{
        System.out.println("\nStatic Block : College Name Initialized");
        collegeName = "SGGSIE&T Nanded";   
    }

    {
        System.out.println("\nInit Block : Course & Student Id Initialized ");
        course = "Java Programming";
        studentId = counter++;
    }
    
    Student(String _name , int _age){
        System.out.println("\nConstructor : Student Name & Age Initialized");
        studentName = _name;
        age = _age;
    }
    
    void displayDetails(){
        System.out.println("\nStudent Details");
        System.out.println("College Name:"+collegeName);
        System.out.println("Course Name:"+course);
        System.out.println("Student Id:"+studentId);
        System.out.println("Student Name:"+studentName);
        System.out.println("Student Age:"+age);
    }
    
    public static void main(String[] args){
        Student student1=new Student("Aniket",20);
        student1.displayDetails();
        
        Student student2=new Student("Rahul",21);
        student2.displayDetails();
    }
}
