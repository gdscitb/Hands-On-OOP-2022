package soLid;

public class side_to_side {
  
  public static Fourside newSquare(int side) {
    return new Fourside(side, side);
}

  public static Fourside newRectangle(int width, int height) {
    return new Fourside(width, height);
  }
}

