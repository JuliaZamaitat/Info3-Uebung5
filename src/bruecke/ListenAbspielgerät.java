package bruecke;
import java.util.ArrayList;

public class ListenAbspielgerät extends Abspielgerät {
    ArrayList<Integer> list ;

    public ListenAbspielgerät(IAbspielgerätImplementierer implementierer, ArrayList<Integer> list) {
        super(implementierer);
        this.list = list;
    }

    void playAndOff(){
        for(Integer song: this.list){
            implementierer.jumpToTrack(song);
        }
        implementierer.off();
    }
}


