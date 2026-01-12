import java.util.Scanner;
public class EvenandOdd {
    public static void main(String[] args) 
    {
        Scanner num= new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num1= num.nextInt();
        if(num1 % 2 == 0)
        {
            System.out.println("It is an Even number");
        }
        else
        {
            System.out.println("It is an Odd number");

        }
    }
}
