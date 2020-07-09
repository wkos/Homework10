package pl.wkos.homework102;

public class ComputerTest {
    public static void main(String[] args) {
        Hdd hdd = new Hdd("Seagate111", "Seagate", "sg1111", 1024);
        Processor processor = new Processor("AMD", "AMD", "amd111",
                2500,77,100);
        Ram ram = new Ram("DDR", "Kingston", "king111",1066,
                50, 91, 128);
        Computer computer = new Computer("Dell", "Dell", "vostro1111",
                hdd, ram, processor);

        System.out.println(computer.toString());
        System.out.println("--------------------\nZwiększam taktowanie procesora");
        for (int i = 1; i < 5; i++) {
            System.out.println(computer.getProcessor().showTemperature());
            computer.getProcessor().overclock(100);
        }
        System.out.println("--------------------\nZwiększam taktowanie RAM-u");
        for (int i = 1; i < 5; i++) {
            System.out.println(computer.getRam().showTemperature());
            computer.getRam().overclock(100);
        }
    }
}