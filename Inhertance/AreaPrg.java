class Area {
    int area(int side){
        return side * side;
    }
    int area(int length, int width){
        return length * width;
    }
}
public class AreaPrg {
    public static void main(String[] args) {
        Area obj = new Area();
        System.out.println("Area of square: " + obj.area(5));
        System.out.println("Area of rectangle: " + obj.area(5, 10));

    }
}