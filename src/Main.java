public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Petrol", 150, 1200.0, 50000.0);
        car.print();

        PassengerCar passengerCar = new PassengerCar("Honda", "Petrol", 200, 1400.0, 30000.0);
        passengerCar.print();

        Truck truck = new Truck("Volvo", "Diesel", 300, 8000.0, 100000.0);
        truck.print();
    }
}
