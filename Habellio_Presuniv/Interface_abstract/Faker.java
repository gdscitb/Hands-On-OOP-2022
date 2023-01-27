package Interface_abstract;

//Faker is a League of Legend pro player

public class Faker implements First_blood,Pentakill,Killed{
  
  //Faker got 1st kill in the match
  @Override
  public void first(){
    System.out.println("Faker got first blood !!!");
  }

  //Faker got killed by enemy
  @Override
  public void kill() {
    System.out.println("Faker got killed in action");
  }

  //Faker kill all of the enemy 
  @Override
  public void Penta() {
    System.out.println("What a beautiful pentakill by faker");    
  }
}