interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements Resizable {
    private int width;
    private int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public void resizeWidth(int width) {
        if (width > 0) {
            this.width = width;
            System.out.println("Width resized to: " + this.width);
        } else {
            System.out.println("Invalid width. It must be greater than 0.");
        }
    }
    
    public void resizeHeight(int height) {
        if (height > 0) {
            this.height = height;
            System.out.println("Height resized to: " + this.height);
        } else {
            System.out.println("Invalid height. It must be greater than 0.");
        }
    }
    
    public void displayDimensions() {
        System.out.println("Rectangle [Width = " + width + ", Height = " + height + "]");
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        System.out.println("Original dimensions:");
        r.displayDimensions();
        
        System.out.println("\nResizing dimensions:");
        r.resizeWidth(15);
        r.resizeHeight(25);
        r.displayDimensions();
        
        System.out.println("\nAttempting invalid resize:");
        r.resizeWidth(-5);
        r.resizeHeight(0);
    }
}
