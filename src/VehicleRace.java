import java.util.Random;

public class VehicleRace {
    public static void main(String[] args) {
        Vehicle mustang = new Vehicle(100, 0, "mustang");
        Vehicle porsche = new Vehicle(105, 0, "porsche");

        showStats(mustang);
        showStats(porsche);

        race(mustang, porsche);
    }

    public static void showStats(Vehicle car){
        System.out.println(car.getBrand() + "- average speed: " + car.getSpeed() + ". The "
                + car.getBrand() + " has traveled " + car.getDistanceTraveled() + " miles.");
    }

    public static void race(Vehicle car1, Vehicle car2){
        while ((car1.getDistanceTraveled() <= 500) && (car2.getDistanceTraveled() <= 500)){
            pause(500);
            drive(car1);
            drive(car2);
            if(car1.getDistanceTraveled() >= 500){
                System.out.println(car1.getBrand() + " won!");
            } else if (car2.getDistanceTraveled() >= 500) {
                System.out.println(car2.getBrand() + " won!");
            }
        }
    }

    public static void drive(Vehicle car){
        Random rand = new Random();
        int distance = car.getDistanceTraveled();
        int randomNum = rand.nextInt(20);
        int newDistance;
        if(randomNum < 10){
            newDistance = car.getSpeed() - 10;
        }else {
            newDistance = car.getSpeed() + 10;
        }
        car.setDistanceTraveled(distance + newDistance);
        System.out.println(car.getBrand() + " has traveled " + newDistance + " miles for a total of " + car.getDistanceTraveled());
    }

    public static void pause(int milliseconds){
        try{
            Thread.sleep(milliseconds);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }

}
