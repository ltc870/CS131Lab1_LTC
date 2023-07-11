import java.util.Arrays;

/**
 * This is the Application object that will launch our application
 * 
 * @author Rob Kelley
 * @version 1.3
 *          Lab1
 *          CS131ON
 */
public class Application {

	public static void main(String[] args) {

		// empty argument constructor
		NonPlayerCharacter nonPlayerCharacter1 = new NonPlayerCharacter();
		System.out.println("empty argument constructor");
		System.out.println(nonPlayerCharacter1.reportStructure());
		System.out.println(nonPlayerCharacter1.introduce());
		System.out.println(nonPlayerCharacter1.exclaim());

		System.out.println("\n");

		// empty argument constructor
		BasketballTeam basketballTeam1 = new BasketballTeam();
		basketballTeam1.setTeamName("The Pine Bluff Zebras");
		basketballTeam1.setTeamMascot("Big Red the Zebra");
		basketballTeam1.setHeadCoach("Pine Bluff Native person");
		basketballTeam1.setStats(50, 10, 105, 105, 65, 80);
		System.out.println(Arrays.toString(basketballTeam1.getStats()));

		// Uncomment the line below to ensure reportStructure() method works after you
		// have written it.
		// System.out.println(npc.reportStructure());

	}// end main

}// end class