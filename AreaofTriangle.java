import java.util.Scanner;
public class AreaofTriangle {
    public static void main(String[] args) 
    {
        Scanner tri=new Scanner(System.in);
        System.out.println("Enter the length of side a :");
        double a= tri.nextDouble();
        System.out.println("Enter the length of side b :");
        double b= tri.nextDouble();
        System.out.println("Enter the length of side c :");
        double c= tri.nextDouble();
        double s=a+b+c/2;
        double Area=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println("The Area of Triangle is:");
        System.out.println(Area);
    }
    
}
