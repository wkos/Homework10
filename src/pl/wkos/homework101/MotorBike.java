package pl.wkos.homework101;

public class MotorBike extends Vehicle{
    private int speedLimit;

    public MotorBike(String id, String name, int carYear, int speedLimit) {
        super(id, name, carYear);
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return super.toString() + ", v max" + speedLimit;
    }
}
