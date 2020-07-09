package pl.wkos.homework102;

public class Computer  extends ManufcturerData {
    private Hdd hdd;
    private Ram ram;
    private Processor processor;

    public Computer(String modelName, String manufacturer, String serialNumber,
                    Hdd hdd, Ram ram, Processor processor) {
        super(modelName, manufacturer, serialNumber);
        this.hdd = hdd;
        this.ram = ram;
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public String showTemperature(){
        return "Procesor\n\t" + processor.toString() + "\nRAM\n\t" + ram.toString();
    }

    @Override
    public String toString() {
        return "Computer{" + super.toString() + "\n" +
                "hdd=" + hdd + "\n" +
                "ram=" + ram + "\n" +
                "processor=" + processor +
                '}';
    }
}
