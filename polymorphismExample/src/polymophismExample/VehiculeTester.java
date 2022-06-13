package polymophismExample;

public class VehiculeTester {
    public static void main(String[] args){
        Vehicle[] vehicles = new Vehicle[3];

        // Add a Car, Plane and Boat objects to the array
        vehicles[0] = new Car();
        vehicles[1] = new Plane();
        vehicles[2] = new Boat();

        for (int i = 0; i < vehicles.length; i++) {
            Vehicle vehicle = vehicles[i];
            vehicle.speed();
        }
    }
}
