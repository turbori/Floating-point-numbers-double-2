import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double z, zSquared;

        System.out.println("What is your z? ");
        z = scnr.nextDouble();

        zSquared = z * z;



        System.out.printf("%.2f\n", zSquared);
    }
}