package Singleton;

public class Main {
  
  public static void main(String[] args) {
    
    Summon call = Summon.getInstance( );
    call.summoned();
  }
}
