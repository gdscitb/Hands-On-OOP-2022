import java.util.Scanner;
import java.util.ArrayList;

public class Main{
   static Scanner UserInput = new Scanner( System.in );
   public ArrayList<Character> characters = new ArrayList<Character>();
   public MonsterFactory monsterBuilder = new MonsterFactory();
   void loop(){
      while(true){
         System.out.println("Choose your character:");
         for(int i = 0; i < characters.size(); i++){
            System.out.println(i + 1 + ". " + characters.get(i).getName());
         }
         System.out.println("0. Exit");
         int choice = UserInput.nextInt();
         if(choice == 0){
            break;
         }
         Character c = characters.get(choice - 1);
         Monster m = monsterBuilder.build("Goblin");
         c.printDetails();
         m.printDetails();
         c.attack(m);
         m.attack(c);

      }
   }
   public Main(){
      Archer archer = new Archer("ArcherWan");
      Warrior warrior = new Warrior("WarriorWan");
      Archer archer2 = new Archer("ArcherWan2",200,200,20,20,20,2);
      Warrior warrior2 = new Warrior("WarriorWan2",200,200,20,20,20,2);
      characters.add(archer);
      characters.add(warrior);
      characters.add(archer2);
      characters.add(warrior2);
      System.out.println("Welcome to the game!");
      loop();

   }







   public static void main(String[] args){
      new Main();

   }
//end main
}

