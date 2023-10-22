public class PassengerCar extends Vehicle implements Object {
    public PassengerCar(String brand, String engineType, int enginePower, double weight, double mileage) {
        super(brand, engineType, enginePower, weight, mileage);
    }

    @Override
    public void print() {
        System.out.println("Passenger car brand: " + getBrand());
    }
}
