class shape{
    void draw(){
        System.out.println("Drawing shape");
    }
}

class circle extends shape{
    void draw(){
        System.out.println("Drawing circle");
    }
}

public class ShapeIher {
    public static void main(String[] args) {
        circle c = new circle();
        c.draw();
    }
}