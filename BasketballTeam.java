public class BasketballTeam extends SportsTeam {

  // instance variables
  private int fieldGoals;
  private int fieldGoalsAttempted;
  private int freeThrows;
  private int freeThrowsAttempted;

  // CONSTRUCTORS
  // empty argument constructor
  public BasketballTeam() {
    super();
    this.setFieldGoals(0);
    this.setFieldGoalsAttempted(0);
    this.setFreeThrows(0);
    this.setFreeThrowsAttempted(0);
  }

  // preferred constructor
  public BasketballTeam(String teamName, String teamMascot, String headCoach) {
    super.setTeamName(teamName);
    super.setTeamMascot(teamMascot);
    super.setHeadCoach(headCoach);
    this.fieldGoals = 0;
    this.fieldGoalsAttempted = 0;
    this.freeThrows = 0;
    this.freeThrowsAttempted = 0;
  }

  // getters and setters
  public int getFieldGoals() {
    return fieldGoals;
  }

  public void setFieldGoals(int fieldGoals) {
    this.fieldGoals = fieldGoals;
  }

  public int getFieldGoalsAttempted() {
    return fieldGoalsAttempted;
  }

  public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
    this.fieldGoalsAttempted = fieldGoalsAttempted;
  }

  public int getFreeThrows() {
    return freeThrows;
  }

  public void setFreeThrows(int freeThrows) {
    this.freeThrows = freeThrows;
  }

  public int getFreeThrowsAttempted() {
    return freeThrowsAttempted;
  }

  public void setFreeThrowsAttempted(int freeThrowsAttempted) {
    this.freeThrowsAttempted = freeThrowsAttempted;
  }

  // methods
  public double fieldGoalPercentage() {
    double percentage = (double) fieldGoals / fieldGoalsAttempted;
    return percentage;
  }

  public double freeThrowPercentage() {
    double percentage = (double) freeThrows / freeThrowsAttempted;
    return percentage;
  }

  public void setStats(int wins, int loses, int fieldGoals, int fieldGoalsAttempted, int freeThrows,
      int freeThrowsAttempted) {
    super.setWins(wins);
    super.setLoses(loses);
    this.fieldGoals = fieldGoals;
    this.fieldGoalsAttempted = fieldGoalsAttempted;
    this.freeThrows = freeThrows;
    this.freeThrowsAttempted = freeThrowsAttempted;
  }

  @Override
  public double[] getStats() {
    double[] stats = new double[3];
    stats[0] = Math.round(this.getWinPercentage() * 100.0);
    stats[1] = Math.round(this.fieldGoalPercentage() * 100.0);
    stats[2] = Math.round(this.freeThrowPercentage() * 100.0);

    return stats;
  }
}