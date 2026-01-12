import java.util.Scanner;

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String s) {
        super(s);
    }
}

public class DivisionByZeroDemo {
    public static double divide(int n, int d) throws DivisionByZeroException {
        if (d == 0) {
            throw new DivisionByZeroException("Error: Division by 0 is not allowed.");
        }
        return (double) n / d;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, denom;
        
        try {
            System.out.print("Enter the numerator: ");
            num = sc.nextInt();
            
            System.out.print("Enter the denominator: ");
            denom = sc.nextInt();
            
            double result = divide(num, denom);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter integers only.");
        } finally {
            System.out.println("Execution completed. Thank you!");
            sc.close();
        }
    }
}
