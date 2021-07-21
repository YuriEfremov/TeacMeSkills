package by.teachmeskills.lection8.Instr;

public class Trumpet implements Instrument {

    int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.printf("Playing trumpet with diameter: %d\n", diameter);

    }
}
