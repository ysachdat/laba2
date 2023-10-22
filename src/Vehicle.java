public abstract class Vehicle implements Transport {
    private String brand;
    private String engineType;
    private int enginePower;
    private double weight;
    private double mileage;

    public Vehicle(String brand, String engineType, int enginePower, double weight, double mileage) {
        this.brand = brand;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.weight = weight;
        this.mileage = mileage;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getMileage() {
        return mileage;
    }
}
