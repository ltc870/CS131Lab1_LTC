public abstract class SportsTeam {

  // instance variables
  protected String teamName;
  protected String teamMascot;
  protected String headCoach;
  protected int wins;
  protected int loses;

  // CONSTRUCTORS
  // empty argument constructor
  public SportsTeam() {
    this.teamName = "";
    this.teamMascot = "";
    this.headCoach = "";
    this.wins = 0;
    this.loses = 0;
  }

  // preferred constructor
  public SportsTeam(String teamName, String teamMascot, String headCoach) {
    this.teamName = teamName;
    this.teamMascot = teamMascot;
    this.headCoach = headCoach;
  }

  // getters and setters
  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public String getTeamMascot() {
    return teamMascot;
  }

  public void setTeamMascot(String teamMascot) {
    this.teamMascot = teamMascot;
  }

  public String getHeadCoach() {
    return headCoach;
  }

  public void setHeadCoach(String headCoach) {
    this.headCoach = headCoach;
  }

  public int getWins() {
    return wins;
  }

  public void setWins(int wins) {
    this.wins = wins;
  }

  public int getLoses() {
    return loses;
  }

  public void setLoses(int loses) {
    this.loses = loses;
  }

  public double getWinPercentage() {
    double winPercentage = (double) wins / (wins + loses);
    return winPercentage;
  }

  public abstract double[] getStats();
}