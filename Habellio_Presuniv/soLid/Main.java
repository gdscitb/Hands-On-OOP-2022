package soLid;

public class Main {
  
  public static void main(String[] args) {
    Fourside rectangle = side_to_side.newRectangle(6, 4);
        Fourside square = side_to_side.newSquare(7);

        showArea(rectangle);
        showArea(square);
    }

    private static void showArea(Fourside figure) {
        System.out.println("Expected area is " + figure.getArea() + " for " + figure.toString());
    }
}

