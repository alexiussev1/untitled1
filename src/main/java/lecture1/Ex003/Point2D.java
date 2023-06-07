package lecture1.Ex003;


/**
 * Это точка 2 D
 */
public class Point2D {
    private int x, y; // Это координата х и у

    /**
     * Это конструктор
     *
     * @param valueX Это координата Х
     * @param valueY Это координата Y
     */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value){
        this(value, value); // использует конструктор строки 6
        //this.x = value;
        //this.y = value;
    }

    public Point2D(){
        this (0);
    }

    public static void distance(Point2D a, Point2D b) {
    }

    public int getX(){
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int value){
        this.x = value;
     }

    public void setY(int value){
        this.y = value;
    }

    private String getInfo (){
        return String.format("x: %d; y: %d", x, y);
    }
    @Override                                               // перегрузка
    public String toString() {
        return getInfo();
    }
}