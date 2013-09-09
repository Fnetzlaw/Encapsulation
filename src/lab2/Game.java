/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author netzl_000
 */
public class Game {
    private Scanner keyboard = new Scanner (System.in);
    private int mage_Health = 80;
    private int mage_atkDamage = 10;
    
    private int warrior_Health = 100;
    private int warrior_atkDamage = 5;

    public int askMage(){
        System.out.println("Would you like to Attack or Pass Turn?");
        String inputNumber = keyboard.nextLine();
        int outputNumber = Integer.parseInt(inputNumber);
        return outputNumber;
    }
    
    public int askWarrior(){
        System.out.println("Would you like to Attack or Pass Turn?");
        String inputNumber = keyboard.nextLine();
        int outputNumber = Integer.parseInt(inputNumber);
        return outputNumber;
    }

    public void setMage_Health(int mage_Health) {
        this.mage_Health = mage_Health;
    }

    public void setWarrior_Health(int warrior_Health) {
        this.warrior_Health = warrior_Health;
    }
    
    
    public int getMage_Health() {
        //needs validation
        return mage_Health;
    }

    public int getMage_atkDamage() {
        //needs validation
        return mage_atkDamage;
    }

    public int getWarrior_Health() {
        //needs validation
        return warrior_Health;
    }

    public int getWarrior_atkDamage() {
        //needs validation
        return warrior_atkDamage;
    }

    
    
    
    
}
