package bruecke;

public class Abspielgerät {
    IAbspielgerätImplementierer implementierer;
    public Abspielgerät(IAbspielgerätImplementierer implementierer){
        this.implementierer = implementierer;

    }

    void play (int track, AbspielDaten daten){
        implementierer.jumpToTrack(track);
        implementierer.readData(daten);
    }

    void off(){
        implementierer.off();
    }
}
