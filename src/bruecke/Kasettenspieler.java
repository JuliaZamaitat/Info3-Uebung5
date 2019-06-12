package bruecke;

import java.sql.SQLOutput;

public class Kasettenspieler implements IAbspielgerätImplementierer {

    @Override
    public void jumpToTrack(int track) {
        reverseToBeginning();
        System.out.println("skip to track "+ track);
    }

    @Override
    public void readData(AbspielDaten data) {
        System.out.println("Cassette Recorder data: "+data.toString());

    }

    @Override
    public void off() {
        System.out.println("Cassette Recorder is shutting off");

    }
    public void reverseToBeginning(){
        System.out.println("Reversed Cassette to the Start");
    }

}
