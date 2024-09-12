import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( "Enter Principle Amount: " );
        double principle = scanner.nextDouble();

        System.out.print( "Enter Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();

        System.out.print( "Enter Period of Year: ");
        int periodOfYear = scanner.nextInt();

        System.out.println("Enter Principle Amount: " + principle);
        System.out.println("Enter Annual Interest Rate: "+ annualInterestRate);
        System.out.println("Enter Period of Year: "+ periodOfYear);

        scanner.close();


    }
}