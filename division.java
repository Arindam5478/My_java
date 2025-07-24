import java.util.Scanner;
public class division {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        double dividend = input.nextDouble();
        System.out.println("Enter the divisor: ");
        double divisor = input.nextDouble()

        if (divisor == 0){
            System.out.println("Divison by zero is not allowed.");

        } else{
            double result = dividend/ divisor;
            System.out.println("Result: "+ result);
        }
        input.close();

    }
    
}
