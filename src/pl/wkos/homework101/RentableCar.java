package pl.wkos.homework101;

public class RentableCar extends Car implements Rentable {
    private boolean rented;
    Person person;

    public RentableCar(Car car) {
        super(car.getId(), car.getName(), car.getProductionYear(), car.getNumberOfSeats());
    }

    public void rent(String firstName, String lastName, String id) {
        if (rented) System.out.println("Samochód wypożyczony, weź inny");
        else {
            rented = true;
            person = new Person(firstName, lastName);
        }
    }

    public void handOver() {
        rented = false;
        person = null;
    }

    public boolean isRent() {
        return rented;
    }

    @Override
    public String toString() {
        return ", wypożyczony - " + rented;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}
