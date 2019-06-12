package bruecke;

public class CDSpieler implements IAbspielgerätImplementierer {
    @Override
    public void jumpToTrack(int track) {
        System.out.println("Searching for Song");
        System.out.println("found Song: "+track);
    }

    @Override
    public void readData(AbspielDaten data) {
        System.out.println("CD-Data: "+ data.toString());

    }

    @Override
    public void off() {
        System.out.println("CD Player is shutting off");

    }
}
