package pl.wkos.homework101;

public class CarTest {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Jan", "Abacki");
        people[1] = new Person("Ewa", "Babacka");
        people[2] = new Person("Ala", "Cabacka");
        System.out.println("Wypożyczający");
        for (Person person : people)
            System.out.println(person.toString());

        System.out.println("-------------------------------");
        System.out.println("Samochody");
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("ford01", "Ford", 2014, 4);
        vehicles[1] = new Car("volvo01", "Volvo", 2020, 5);
        vehicles[2] = new MotorBike("yamaha01", "Yamaha", 2010, 220);
        vehicles[3] = new MotorBike("suzuki01", "Suzuki", 2002, 180);
        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle);

        RentableCar[] rentableCars = new RentableCar[3];
        for (int i = 0; i < 2; i++) {
            rentableCars[i] = new RentableCar((Car) vehicles[i]);
            if (rentableCars[i].isRent())
                System.out.println(vehicles[i].toString() + " wypożyczony");
            else
                System.out.println(vehicles[i].toString() + " wolny");
        }
        System.out.println("-------------------------------");
        System.out.println("Pożyczam samochód");
        rentableCars[0].rent(people[0].getFirstName(), people[0].getLastName(), vehicles[0].getId());
        System.out.println(people[0].toString() + vehicles[0].toString() + rentableCars[0].toString());
        System.out.println("-------------------------------");
        System.out.println("Pożyczam samochód wypożyczony");
        rentableCars[0].rent(people[1].getFirstName(), people[1].getLastName(), vehicles[0].getId());
        System.out.println(people[0].toString() + vehicles[0].toString() + rentableCars[0].toString());
        System.out.println("-------------------------------");
        System.out.println("Zwracam samochód");
        rentableCars[0].handOver();
        rentableCars[0].setPerson(null);
        System.out.println("pożyczający: " + rentableCars[0].getPerson());
        System.out.println(people[0].toString() + vehicles[0].toString() + rentableCars[0].toString());
        System.out.println("-------------------------------");
        rentableCars[1] = new RentableCar((Car) vehicles[1]);
        rentableCars[1].rent(people[1].getFirstName(), people[1].getLastName(), vehicles[1].getId());
        System.out.println(people[1].toString() + vehicles[1].toString() + rentableCars[1].toString());
        rentableCars[2] = new RentableCar((Car) vehicles[1]);
        rentableCars[2].rent(people[2].getFirstName(), people[2].getLastName(), vehicles[1].getId());
        System.out.println(people[2].toString() + vehicles[2].toString() + rentableCars[1].toString());
        System.out.println("-------------------------------");
        vehicles[2].turnLeft();
        System.out.println(vehicles[2].showDirection());
        vehicles[2].turnRight();
        System.out.println(vehicles[2].showDirection());
        vehicles[2].goForward();
        System.out.println(vehicles[2].showDirection());
        vehicles[2].goBack();
        System.out.println(vehicles[2].showDirection());
    }
}
