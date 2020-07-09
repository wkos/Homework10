package pl.wkos.homework101;

public abstract class Vehicle implements Moveable {
    private String id;
    private String name;
    private int productionYear;
    private String direction;

    public Vehicle(String id, String name, int productionYear) {
        this.id = id;
        this.name = name;
        this.productionYear = productionYear;
    }

    public void turnLeft() {
        direction = "lewo";
    }

    public void turnRight() {
        direction = "prawo";
    }

    public void goForward() {
        direction = "przód";
    }

    public void goBack() {
        direction = "tył";
    }

    public String showDirection() {
        return "Jadę w " + direction;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", rocznik " + productionYear;
    }

    public String getId() {
        return id;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getName() {
        return name;
    }
}
