import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls
 * (as opposed to objects a human player controls).
 * 
 * @author
 * @version 1.3
 *          Lab1
 *          CS131ON
 */

public class NonPlayerCharacter extends GameCharacter {

  // instance variables
  private boolean active;
  private String intelligenceType;

  // CONSTRUCTORS
  // empty argument constructor
  public NonPlayerCharacter() {
    super();
    this.setActive(false);
    this.setIntelligenceType("AVERAGE");
  }

  // preferred constructor
  public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
    super.setUniqueID(id);
    super.setPersonality(personality);
    this.setActive(active);
    this.setIntelligenceType(intelligenceType);
  }

  // getters and setters
  public boolean isActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  public String getIntelligenceType() {
    return intelligenceType;
  }

  public void setIntelligenceType(String intelligenceType) {
    this.intelligenceType = intelligenceType;
  }

  public String introduce() {
    String str = "";
    str = "Hello, my name is: " + uniqueID;
    return str;
  }

  public String exclaim() {
    String[] exclamation = { "Dag Gummit", "Doggone It", "Holy cow", "Jeez", "Well cheese and crackers" };
    SecureRandom secureRandom = new SecureRandom();
    int index = secureRandom.nextInt(exclamation.length);
    return exclamation[index];
  }

  /**
   * Returns the structure of the object in a specially
   * formatted representation. This is the preferred
   * method for printing out the object structure.
   * 
   * @return
   */
  @Override
  public String reportStructure() {

    StringBuilder stringBuilder = new StringBuilder("==================================\n");
    stringBuilder.append("UniqueID: " + getUniqueID() + "\n");
    stringBuilder.append("Personality: " + getPersonality() + "\n");
    stringBuilder.append("==================================\n");
    stringBuilder.append("Active: " + isActive() + "\n");
    stringBuilder.append("Intelligence: " + getIntelligenceType() + "\n");
    stringBuilder.append("==================================\n");

    return stringBuilder.toString();
  }// end reportStats
}// end class
