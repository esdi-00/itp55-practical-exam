import java.util.Scanner;

public class Main
{
    // checker
    // System.out.println("something = "+ c);
    private static Scanner sc;

    public static void main(String[]args)
    {
        sc = new Scanner(System.in);
        try
        {
            choices();

            sc.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    // this will make the user what appliances they want to use
    public static void choices()
    {
        while(true)
        {
            System.out.println("What Appliances you want to use?");
            System.out.println("Computers = c");
            System.out.println("Refrigerator = r");
            System.out.println("Television = t");
            System.out.println("Exit = e");
            System.out.print("==");
            String c = sc.nextLine().toLowerCase();

            if(c.equals("c"))
            {
                System.out.println("Computers = c");
            }
            else if (c.equals("r"))
            {
                System.out.println("Refrigerator = r");
            }
            else if (c.equals("t"))
            {
                System.out.println("Television = t");
            }
            else if (c.equals("e"))
            {
                System.out.println("Exit = e");
                break; // exit the loop
            }
            else
            {
                System.out.println("cannot be recognize");
            }
        }
    }
    


}
