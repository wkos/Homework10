package pl.wkos.homework102;

public abstract class Clocking extends ManufcturerData implements Overclocking{
    private int clock;
    private int workingTemperature;
    private int maxTemperature;

    public Clocking(String modelName, String manufacturer, String serialNumber, int clock,
                    int workingTemperature, int maxTemperature) {
        super(modelName, manufacturer, serialNumber);
        this.clock = clock;
        this.workingTemperature = workingTemperature;
        this.maxTemperature = maxTemperature;
    }

    public int getClock() {
        return clock;
    }

    public int getWorkingTemperature() {
        return workingTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setWorkingTemperature(int workingTemperature) {
        this.workingTemperature = workingTemperature;
    }

    public void setClocking(int clocking) {
        this.clock = clocking;
    }

    @Override
    public String toString() {
        return "Taktowanie " + clock + ", temperatura " + workingTemperature;
    }
}
