package by.teachmeskills.lection8.Instr;

public class RunInstrument {
    public static void main(String[] args) {
        //Probe ef = new Probe();
        //Probe efr = new Probe();
        Instrument[] instarr = new Instrument[3];
        instarr[0] = new Drum(50);
        instarr[1] = new Guitar(6);
        instarr[2] = new Trumpet(15);
        for (Instrument i : instarr) {
            i.play();
        }

    }
}
