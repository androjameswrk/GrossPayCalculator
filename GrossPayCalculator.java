import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String args[]) {
        Scanner A = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String Name = A.nextLine();

        System.out.print("Press F for Full Time or P for Part Time: ");
        String Key = A.nextLine();
        
        if(Key.equalsIgnoreCase("F")) {
            System.out.print("Enter rate per hour: ");
            double Rate = A.nextDouble();

            System.out.print("Enter no. of hours worked: ");
            double HrsWork = A.nextDouble();

            System.out.print("Enter no. of overtime: ");
            double Overtime = A.nextDouble();

            Double BasicPay = Rate * HrsWork;
            Double OvertimePay = 102.625 * Overtime;
            Double GrossPay = BasicPay + OvertimePay;

            System.out.println("Employee Name: " + Name);
            System.out.println("Basic Pay: " + BasicPay);
            System.out.println("Overtime Pay: " + OvertimePay);
            System.out.println("Gross Pay: " + GrossPay);
        } else if(Key.equalsIgnoreCase("P")) {
            System.out.print("Enter Basic Pay: ");
            double BasicPay = A.nextDouble();

            System.out.println("Employee Name: " + Name);
            System.out.println("Basic Pay: " + BasicPay);
            System.out.println("Gross Pay: " + BasicPay);
        } else {
            System.out.print("Error please try again");
        }
    }
}
