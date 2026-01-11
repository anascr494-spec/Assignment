import java.util.Scanner;
public class Percentage
{

    public static void main(String[]args)
    {
        Double om, mm, percentage;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your Obtained Marks(om):");
        om = sc.nextDouble();
        System.out.println( "Enter Maximum Marks(mm)");
        mm = sc.nextDouble();
        percentage= om/mm*100;
        System.out.println("The percentage is:");
        System.out.println(percentage);

    }

    
    
}