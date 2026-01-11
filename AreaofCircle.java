import java.util.Scanner;
public class AreaofCircle {
    public static void main(String[] args) {

        Scanner read= new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double R = read.nextDouble();
        System.out.println("The area of the circle is:");
        double Area= Math.PI*R*R;
        System.out.println(Area+"m^2");
        System.out.println("The circumference of the circle is:");
        double circumference= 2*Math.PI*R;
        System.err.println(circumference+"m");

    }
}
