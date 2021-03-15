package Patterns.facade;

public class HDD {

    void copyFromDVD(DVDrom dvDrom) {
        if (dvDrom.hasData()) {
            System.out.println("copy data");
        } else {
            System.out.println("enter dvd");
        }
    }
}
