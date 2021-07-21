package by.teachmeskills.lection8.Instr;

public class Drum implements Instrument {
    private int size;

    public Drum(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.printf("Playing Drum with size: %d\n", size);

    }
}

