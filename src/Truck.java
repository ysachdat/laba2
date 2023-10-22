public class Truck extends Vehicle implements Object {
    public Truck(String brand, String engineType, int enginePower, double weight, double mileage) {
        super(brand, engineType, enginePower, weight, mileage);
    }

    @Override
    public void print() {
        System.out.println("Truck brand: " + getBrand());
    }
}
