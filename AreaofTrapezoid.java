import java.util.Scanner;
public class AreaofTrapezoid {
    public static void main(String[] args) {
        Scanner tp= new Scanner(System.in);
        System.out.println("Enter the length of side (a):");
        double a= tp.nextDouble();
        System.out.println("Enter the length of side (b):");
        double b= tp.nextDouble();
        System.out.println("Enter the height (h)");
        double h= tp.nextDouble();
        if(b==a)
        {
            System.out.println("Both sides of Trapezoid cannot be equal...");
        }
        else
        {
            double K= h*(a+b)/2;
            System.out.println("The Area of the trapezoid is:");
            System.out.println(K);
        }
    }
}
