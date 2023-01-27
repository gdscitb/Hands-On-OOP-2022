package Singleton;

public class Summon {
  
  private static Summon summon = new Summon( );

   private Summon() { }

   public static Summon getInstance( ) {
      return summon;
   }

   protected static void summoned( ) {
      System.out.println("Hello Master");
   }
}

