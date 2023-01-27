package Polymorphism;

public class Main {
  public static void main(String[] args) {
    
    Adam adam = new Adam();
    Eve eve = new Eve();
    Bambang bambang = new Bambang();

    Human[] walking =  {adam, eve, bambang};

    for(Human x : walking) {
      x.walk();
    }
  }
}
