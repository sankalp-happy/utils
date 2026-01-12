class OuterClass {
    void display() {
        System.out.println("This is the display method of the Outer class.");
    }
    
    class InnerClass {
        void display() {
            System.out.println("This is the display method of the Inner class.");
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.display();
        
        OuterClass.InnerClass in = out.new InnerClass();
        in.display();
    }
}
