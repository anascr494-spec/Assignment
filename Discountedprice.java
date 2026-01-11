import java.util.Scanner;
public class Discountedprice {
    public static void main(String[] args) 
    {
        Scanner cc= new Scanner(System.in);
        System.out.println("Enter the Original selling price:");
        double osp= cc.nextDouble();
        System.out.println("Enter Discount percentage:");
        double dp= cc.nextDouble();
        double discount= dp*osp/100;
        System.out.println("The discount is:");
        System.out.println(discount);
        double dsp= osp - discount;
        System.out.println("The Discounted selling price is:");
        System.out.println(dsp);
    }
}
