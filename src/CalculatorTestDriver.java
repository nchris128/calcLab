import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorTestDriver {
    public static void main(String[] args) {
        //ArrayList<Calculator> calc = new ArrayList<Calculator>();
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        int int1 = 0;
        int int2 = 0;
        boolean keepOn = true;
        while (keepOn) {
            System.out.println("\n~~Menu~~\n0 - Exit\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\nPlease enter an option: ");
            int x = sc.nextInt();
            switch (x) {
                case 0:
                    System.out.println("Thank you for using my calculator! <3");
                    keepOn = false;
                    break;
                case 1:
                    System.out.println("Please enter first number");
                    int1 = sc.nextInt();
                    System.out.println("Please enter second number");
                    int2 = sc.nextInt();
                    System.out.println(calc.add(int1, int2));
                    //calc.add(new Calculator().add(int1,int2));
                    break;
                case 2:
                    System.out.println("Please enter first number");
                    int1 = sc.nextInt();
                    System.out.println("Please enter second number");
                    int2 = sc.nextInt();
                    System.out.println(calc.subtract(int1, int2));
                    break;
                case 3:
                    System.out.println("Please enter first number");
                    int1 = sc.nextInt();
                    System.out.println("Please enter second number");
                    int2 = sc.nextInt();
                    System.out.println(calc.multiply(int1, int2));
                    break;
                case 4:
                    System.out.println("Please enter first number");
                    int1 = sc.nextInt();
                    System.out.println("Please enter second number");
                    int2 = sc.nextInt();
                    System.out.println(calc.divide(int1, int2));
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }

    }

}
