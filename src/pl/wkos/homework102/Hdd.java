package pl.wkos.homework102;

public class Hdd extends ManufcturerData {
    private int volume;

    public Hdd(String modelName, String manufacturer, String serialNumber, int volume) {
        super(modelName, manufacturer, serialNumber);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Hdd{" + super.toString() +
                "volume=" + volume +
                '}';
    }
}
