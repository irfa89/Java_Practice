/**
 * 
 */
package homework;

/**
 * @author irfa
 *
 */

public class Car {

  private String licensePlate; // e.g. "New York A456 324"
  private double speed;        // kilometers per hour
  private double maxSpeed;     // kilometers per hour
  
  // constructors
  public Car(String licensePlate, double maxSpeed) {

    this(licensePlate, 0.0, maxSpeed);
    
  }

  public Car(String licensePlate, double speed, double maxSpeed) {

    this.licensePlate = licensePlate; 
    if (maxSpeed >= 0.0) {
      this.maxSpeed = maxSpeed;
    }
    else {
      maxSpeed = 0.0;
    }
    
    if (speed < 0.0) {
      speed = 0.0;
    }
    
    if (speed <= maxSpeed) {
      this.speed = speed;
    }
    else {
      this.speed = maxSpeed;
    }
    
  }
  
  public static void main(String[] args) {
	  
	  Car newCar = new Car("NYCXW", 60 , 100);
	  System.out.println("License Plate :" + newCar.licensePlate);
	  System.out.println("Speed :" + newCar.speed);
	  System.out.println("Maximum Speed :" + newCar.maxSpeed);
	  
  }
  
}
