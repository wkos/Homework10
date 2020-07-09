package pl.wkos.homework102;

public class Ram extends Clocking {
    private final double ratioTempToClock = 0.15;
    private int volume;

    public Ram(String modelName, String manufacturer, String serialNumber, int clock,
               int workingTemperature, int maxTemperature, int volume) {
        super(modelName, manufacturer, serialNumber, clock, workingTemperature, maxTemperature);
        this.volume = volume;
    }

    public void overclock(int clock){
        int currentTemperature = super.getWorkingTemperature() + (int)(ratioTempToClock * clock);
        if (currentTemperature < super.getMaxTemperature())
            super.setWorkingTemperature(currentTemperature);
        else
            System.out.println("Za wysoka temperature zmniejsz overclocking pamięci");
    }

    public String showTemperature() {
        return super.toString();
    }

    @Override
    public String toString() {
        return "Ram{" + super.toString() +
                ", volume=" + volume +
                ", clocking=" + super.getClock() +
                '}';
    }
}
