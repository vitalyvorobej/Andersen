package Patterns.facade;

public class Computer {
    private DVDrom dvDrom = new DVDrom();
    private Power power = new Power();
    private HDD hdd = new HDD();

    void copy() {
        power.on();
        dvDrom.load();
        hdd.copyFromDVD(dvDrom);
    }
}
