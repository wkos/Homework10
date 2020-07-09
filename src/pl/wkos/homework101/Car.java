package pl.wkos.homework101;

public class Car extends Vehicle{
    private int numberOfSeats;

    public Car(String id, String name, int carYear, int numberOfSeats) {
        super(id, name, carYear);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return super.toString() + ", liczba siedzeń " + numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
