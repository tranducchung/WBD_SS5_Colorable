import java.util.Arrays;

public class App {
    public static void main(String[] args) {
      Shape[] shapes = new Shape[5];
      shapes[0] = new Square(3);
      shapes[1] = new Square(4);
      shapes[2] = new Cricle(2);
      shapes[3] = new Cricle(5);
      shapes[4] = new Square(7);
     for (Shape shape : shapes){
        if(shape instanceof Square){
            System.out.println(shape);
            ((Square) shape).howToColor();
        }else {
            System.out.println(shape);
        }
     }
    }
}
