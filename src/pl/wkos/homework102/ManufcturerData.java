package pl.wkos.homework102;

public class ManufcturerData {
    private String modelName;
    private String manufacturer;
    private String serialNumber;

    public ManufcturerData(String modelName, String manufacturer, String serialNumber) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "ManufcturerData{" +
                "modelName='" + modelName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
