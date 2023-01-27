package Inheritance;

public class Main {
  public static void main(String[] args){

    Calculate num = new Calculate();
    Square sq = new Square();
    Square.side =  num.num();
    System.out.println("The area of square is = " + sq.area());
  }
}