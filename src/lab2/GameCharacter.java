/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author netzl_000
 */
public class GameCharacter {
    private String mageName;
    private String warriorName;

   public String getMageName() {
        //needs validation
        return mageName;
    }

    public void setMageName(String mageName) {
        //needs validation
        this.mageName = mageName;
    }

    public String getWarriorName() {
        //needs validation
        return warriorName;
    }

    public void setWarriorName(String warriorName) {
        //needs validation
        this.warriorName = warriorName;
    }
}