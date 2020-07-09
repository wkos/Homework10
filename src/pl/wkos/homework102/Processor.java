package pl.wkos.homework102;

public class Processor extends Clocking {
    private final double ratioTempToClock = 0.1;

    public Processor(String modelName, String manufacturer, String serialNumber,
                     int clock, int workingTemperature, int maxTemperature) {
        super(modelName, manufacturer, serialNumber, clock, workingTemperature, maxTemperature);
    }

    public void overclock(int clock) {
        int currentTemperature = super.getWorkingTemperature() + (int) (ratioTempToClock * clock);
        if (currentTemperature < super.getMaxTemperature()) {
            super.setClocking(super.getClock() + clock);
            super.setWorkingTemperature(currentTemperature);
        } else
            System.out.println("Za wysoka temperature zmniejsz overclocking procesora");
    }

    public String showTemperature() {
        return super.toString();
    }

    @Override
    public String toString() {
        return "Processor{" + super.toString() +
                "clocking=" + super.getClock() +
                '}';
    }
}
