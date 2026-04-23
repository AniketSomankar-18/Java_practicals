
import java.util.Scanner;

interface Operations
{
    int MAX = 1000;

    int add(int a, int b);
    int sub(int a, int b);

    default void message()
    {
        helper();
        System.out.println("Default Method from Operations Interface");
    }

    static void info()
    {
        System.out.println("Static Method from Interface");
    }

    private void helper()
    {
        System.out.println("Private Method Called");
    }
}

interface Extra
{
    default void message()
    {
        System.out.println("Default Method from Extra Interface");
    }
}

abstract class Base
{
    abstract void start();

    final void welcome()
    {
        System.out.println("Welcome to Calculator Application");
    }
}

class InvalidNumberException extends Exception
{
    InvalidNumberException(String msg)
    {
        super(msg);
    }
}

class Practical14 extends Base implements Operations, Extra
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public int sub(int a, int b)
    {
        return a - b;
    }

    public void message()
    {
        Operations.super.message();
        Extra.super.message();
    }

    void start()
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            welcome();

            System.out.print("Enter First Number: ");
            int a = sc.nextInt();

            System.out.print("Enter Second Number: ");
            int b = sc.nextInt();

            if(a > MAX || b > MAX)
                throw new InvalidNumberException("Number exceeds limit of 1000");

            System.out.println("Addition = " + add(a,b));
            System.out.println("Subtraction = " + sub(a,b));

            message();
            Operations.info();
        }

        catch(InvalidNumberException e)
        {
            System.out.println("User Defined Exception: " + e.getMessage());
        }

        catch(Exception e)
        {
            System.out.println("Invalid Input");
        }
    }

    public static void main(String args[])
    {
        Practical14 obj = new Practical14();
        obj.start();
    }
}