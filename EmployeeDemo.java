import java.util.Scanner;

class Employee1 {
    private int id;
    private String name;
    private double salary;
    
    public Employee1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100);
        } else {
            System.out.println("Raise percentage must be positive.");
        }
    }
    
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee1 emp1 = new Employee1(101, "Aarohi", 90000);
        
        System.out.println("Before raise:");
        emp1.displayEmployeeDetails();
        
        System.out.print("\nEnter the percentage to raise salary: ");
        double percentage = sc.nextDouble();
        
        emp1.raiseSalary(percentage);
        
        System.out.println("\nAfter " + percentage + "% raise:");
        emp1.displayEmployeeDetails();
        
        sc.close();
    }
}
