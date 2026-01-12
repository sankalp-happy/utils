public class MyPoint {
    private int x;
    private int y;
    
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int[] getXY() {
        return new int[]{this.x, this.y};
    }
    
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }
    
    public double distance() {
        return distance(0, 0);
    }
    
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3, 4);
        MyPoint point2 = new MyPoint(7, 9);
        
        System.out.println("Point1: " + point1.toString());
        System.out.println("Point2: " + point2.toString());
        
        System.out.println("Distance from Point1 to origin: " + point1.distance());
        System.out.println("Distance from Point1 to Point2: " + point1.distance(point2));
        System.out.println("Distance from Point1 to (6, 8): " + point1.distance(6, 8));
    }
}
