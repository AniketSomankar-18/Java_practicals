
class Example
{
    public static void main(String args[])
    {
        try
        {
            if(args.length < 2)
            {
                System.out.println("Usage:");
                System.out.println("java Example 'arg1' 'arg2'");
                return;
            }

            if(args.length > 2)
            {
                System.out.println("Extra arguments detected.");
                System.out.println("Skipping excess arguments...");
            }

            if(args[0].length() != 1)
            {
                System.out.println("First input must be only one character.");
                return;
            }

            char ch = args[0].charAt(0);
            String str = args[1];

            int count = 0;

            // Approach 1 : for loop
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)==ch)
                    count++;
            }

            System.out.println("Using for loop:");
            System.out.println("Character '" + ch + "' repeated " + count + " times");

            // Approach 2 : replace method
            int count2 = str.length() - str.replace(String.valueOf(ch),"").length();

            System.out.println("Using replace method:");
            System.out.println("Character '" + ch + "' repeated " + count2 + " times");
        }

        catch(Exception e)
        {
            System.out.println("Error : " + e);
        }
    }
}