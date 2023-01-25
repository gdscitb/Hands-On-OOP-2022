import java.util.Scanner;

class RPSGame extends Game {
  public RPSGame() {
    super(1, 0, 0, new String[]{"rock", "paper", "scissors"});
  }

  public void play() {
    System.out.println("===============================================");
    System.out.println("===============================================");
    System.out.println("Welcome to the Rock-Paper-Scissors game!");
    System.out.print("Please enter your username: ");
    Scanner scan = new Scanner(System.in);
    String username = scan.nextLine();
    System.out.println("===============================================");

    while(getUserScore() < 3 && getCompScore() < 3) {
      System.out.println("===============================================");
      System.out.println("ROUND " +getRound());
      System.out.println(username + " VS Computer");
      System.out.println(getUserScore() + " - " + getCompScore());
      System.out.println("Options:");
      System.out.println("1. Rock");
      System.out.println("2. Paper");
      System.out.println("3. Scissors");
      System.out.println("Or ANY other key to EXIT");
      System.out.print("Enter your choice number: ");
      String inputPlayerChoice = scan.nextLine();

      // Handle Exit
      if (!(inputPlayerChoice.equals("1") || inputPlayerChoice.equals("2") || inputPlayerChoice.equals("3"))) {
        System.out.println("===============================================");
        System.out.println("===============================================");
        System.out.println("Thank you for playing");
        System.out.println("===============================================");
        System.out.println("===============================================");
        System.exit(0);
      }

      int playerChoice = Integer.parseInt(inputPlayerChoice);
      int computerChoice = (int) (Math.random() * getOptions().length) + 1;
      System.out.println("Computer chose: " + computerChoice);
      
      // Handle round result
      if (playerChoice == computerChoice) {
          System.out.println("It's a tie!");
      } else if (
          (playerChoice == 1 && computerChoice == 3) ||
          (playerChoice == 2 && computerChoice == 1) ||
          (playerChoice == 3 && computerChoice == 2)
      ) {
          System.out.println(username+" WIN!");
          addUserScore();
      } else {
          System.out.println(username+" LOSE!");
          addCompScore();
      }
      newRound();
      System.out.println("===============================================");
    }
    System.out.println("===============================================");
    System.out.println(username + " VS Computer");
    System.out.println(getUserScore() + " - " + getCompScore());
    if (getUserScore() > getCompScore()) {
      System.out.println(username+" WIN!");
    } else {
      System.out.println(username+" LOSE!");
    }
    System.out.println("Thank you for playing");
    System.out.println("===============================================");
    System.out.println("===============================================");
    scan.close();
  }
}
