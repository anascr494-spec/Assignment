import java.util.Scanner;
public class Powercalculation {
    public static void main(String[] args) {
        Scanner pow= new Scanner(System.in);
        System.out.println("Enter Current(amperes):");
        double amp= pow.nextDouble();
        System.out.println("Enter Voltage(volts):");
        double volts= pow.nextDouble();
        double Watts= amp*volts;
        System.out.println("Power consumption: ");
        System.out.println(Watts);
    }
}
