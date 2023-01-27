package Inheritance;

import java.util.Scanner;

public class Calculate {

  public int num(){
    Scanner num = new Scanner(System.in);
    System.out.println("Please enter side: ");
    int numInt = num.nextInt();
    System.out.println("S: " + numInt);
    num.close();
    return numInt;
  }
}