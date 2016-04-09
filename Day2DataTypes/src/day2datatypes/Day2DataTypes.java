
package day2datatypes;

/**
 *
 * @author Jamie
 */
public class Day2DataTypes {
    int maxSpeed = 100;
    int minSpeed = 10;
    double weight = 4790;
    boolean isTheCarOn = false; 
    char condition = 'A';
    
    public void printVariables() {
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
    }
    
    public void changeCondition() {
        condition = 'C';
    }
    
    public static void main(String[] args) {
        Day2DataTypes carry = new Day2DataTypes();
        System.out.println("carry one");
        carry.printVariables();
        Day2DataTypes carryTwo = carry;
        carry.changeCondition();
        System.out.println("carry two");
        carryTwo.printVariables();
        System.out.println("carry one AGAIN");
        carry.printVariables();
    }
    
}
