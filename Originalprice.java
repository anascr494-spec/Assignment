import java.util.Scanner;
public class Originalprice {
    public static void main(String[] args) 
    {
        Scanner cc= new Scanner(System.in);
        System.out.println("Enter the Discounted selling price:");
        double dsp= cc.nextDouble();
        System.out.println("Enter Discount percentage:");
        double dp= cc.nextDouble();
        double discount= dsp/dp*100;
        System.out.println("The discount is:");
        System.out.println(discount);
        double osp= dsp + discount;
        System.out.println("The Original selling price is:");
        System.out.println(osp);
    }
}
