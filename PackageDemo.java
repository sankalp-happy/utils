// Note: For proper package usage, create the following structure:
// myPack/Message.java
// myPack/MathOperations.java
// PackageDemo.java (in root folder)

// --- File: myPack/Message.java ---
/*
package myPack;

public class Message {
    public void showMessage(String name) {
        System.out.println("Hello, " + name + "! Welcome to the myPack package!");
    }
}
*/

// --- File: myPack/MathOperations.java ---
/*
package myPack;

public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
}
*/

// --- Combined version for demonstration (single file) ---

class Message {
    public void showMessage(String name) {
        System.out.println("Hello, " + name + "! Welcome to the myPack package!");
    }
}

class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class PackageDemo {
    public static void main(String[] args) {
        Message m = new Message();
        m.showMessage("Acharya");
        
        MathOperations mo = new MathOperations();
        int sum = mo.add(10, 20);
        int product = mo.multiply(5, 4);
        
        System.out.println("Addition Result: " + sum);
        System.out.println("Multiplication Result: " + product);
    }
}
