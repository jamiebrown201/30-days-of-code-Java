package car;

/**
 *
 * @author Jamie
 */
public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    int numberOfPeopleInCar = 1;
    int maxPeopleInCar = 5;
    
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn, String customNameOfCar) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
        nameOfCar = customNameOfCar;
    }
    
    // Getters and Setters
    
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    
    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed =  newMaxSpeed;
    }
    
    public int getMinSpeed() {
        return this.minSpeed;
    }
    
    public double weight() {
        return this.weight;
    }
    
    public boolean returnIsTheCarOn() {
        return this.isTheCarOn;
    }
    
    
    public void printVariables() {
        System.out.println("This is the maxSpeed " + maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }
    
    public void upgradeMaxSpeed() {
        setMaxSpeed(getMaxSpeed() + 10);
    }
    
    public void getIn() {
        if(numberOfPeopleInCar < maxPeopleInCar){
            numberOfPeopleInCar++;
            System.out.println("Someone got in the car");
        } else {
            System.out.println("Sorry car is full " + numberOfPeopleInCar + " = " + maxPeopleInCar );
        }
    }
    
    public void getOut() {
        if(numberOfPeopleInCar > 0){
            numberOfPeopleInCar--;
            System.out.println("Someone got out the car");
        } else {
            System.out.println("No one is in the car!");
        }
    }
    
    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }
    
    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }
    
    public void turnCarOn() {
        if(!isTheCarOn) { 
         isTheCarOn = true;
        }
        
    }
    
    
    public static void main(String[] args) {
        Car tommyCar = new Car(10, 4021, true, "barry");
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getOut();
    }
    
}
