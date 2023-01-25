abstract class Game {
  private String[] options;
  private Integer round;
  private Integer userScore;
  private Integer compScore;

  public Game(Integer round, Integer userScore, Integer compScore, String[] options) {
    this.round = round;
    this.userScore = userScore;
    this.compScore = compScore;
    this.options = options;
  }

  public abstract void play();

  public Integer getRound(){
    return round;
  }

  public void newRound() {
    this.round += 1;
  }

  public Integer getUserScore(){
    return userScore;
  }

  public void addUserScore() {
    this.userScore += 1;
  }

  public Integer getCompScore(){
    return compScore;
  }

  public void addCompScore() {
    this.compScore += 1;
  }

  public String[] getOptions() {
    return options;
  }
}
