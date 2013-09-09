/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author netzl_000
 */
public class Startup {

    public static void main(String[] args) {
        Game game = new Game();
        GameCharacter gameChar = new GameCharacter();

        gameChar.setMageName("Eleili");
        gameChar.setWarriorName("Tanky");

        System.out.println(gameChar.getMageName() + "\nHP: " + game.getMage_Health()
                + "\nDamage: " + game.getMage_atkDamage());
        System.out.println("");
        System.out.println(gameChar.getWarriorName() + "\nHP: " + game.getWarrior_Health()
                + "\nDamage: " + game.getWarrior_atkDamage());

        for (int x = 1; x < 15; x += 1) {
            if (x == 1) {
                int moveDecided1 = game.askMage();

                if (moveDecided1 == 1) {
                    game.setWarrior_Health(game.getWarrior_Health() - game.getMage_atkDamage());
                    System.out.println("Warior new HP is: " + game.getWarrior_Health());
                    x = 1;
                }
                if (moveDecided1 == 2) {
                    System.out.println("Warrior attack!");
                    x = 2;
                }
            }
            if (x == 2) {
                int moveDecided2 = game.askMage();

                if (moveDecided2 == 1) {
                    game.setWarrior_Health(game.getMage_Health() - game.getWarrior_atkDamage());
                    System.out.println("Mage new HP is: " + game.getMage_Health());
                    x = 2;
                }
                if (moveDecided2 == 2) {
                    System.out.println("Mage attack!");
                    x = 1;
                }
            }

        }
    }
}
