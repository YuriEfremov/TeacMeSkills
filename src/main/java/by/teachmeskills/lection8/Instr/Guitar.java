package by.teachmeskills.lection8.Instr;

public  class Guitar implements Instrument{
    int strnum;

    public Guitar(int strnum) {
        this.strnum = strnum;
    }

    @Override
    public void play() {
        System.out.printf("Playing Guitar with number of strings: %d\n", strnum);

    }
}
