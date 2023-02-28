public abstract class Vehicle {
  //attributes
  private String brand;
  private int kilometers;
  //constructors
  public Vehicle(String brand) {
    this.brand = brand;
    this.kilometers = 10000;
  }
  //getters and setters
  public String getBrand() {
    return this.brand;
  }
  public int getKilometers() {
   return this.kilometers;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  } 
  public void setKilometers(int kilometers) {
    this.kilometers = kilometers;
  }
  //method
  public abstract String doStuff();
}