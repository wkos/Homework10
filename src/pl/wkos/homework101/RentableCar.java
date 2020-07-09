package pl.wkos.homework101;

public class RentableCar extends Car implements Rentable {
    private boolean rented;

    public RentableCar(Car car) {
        super(car.getId(), car.getName(), car.getProductionYear(), car.getNumberOfSeats());
    }

    public void rent(String firstName, String lastName, String id) {
        if (rented) System.out.println("Samochód wypożyczony, weź inny");
        else rented = true;
    }

    public void handOver() {
        rented = false;
    }

    public boolean isRent() {
        return rented;
    }

    @Override
    public String toString() {
        return ", wypożyczony - " + rented;
    }
}
