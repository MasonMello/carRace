public class Vehicle {
    private int speed;
    private int distanceTraveled;
    private String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public Vehicle(int speed, int distanceTraveled, String brand){
        this.brand = brand;
        this.speed = speed;
        this.distanceTraveled = distanceTraveled;
    }
}
