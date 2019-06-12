package bruecke;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
      System.out.println("---CD-Spieler----");
      CDSpieler cd = new CDSpieler();
      AbspielDaten data = new AbspielDaten("Alle meine Entchen schwimmen auf dem See.");
      Abspielgerät ag1 = new Abspielgerät(cd);
      ag1.play(3, data);

      System.out.println("\n---Kasettenspieler----");
      Kasettenspieler kp = new Kasettenspieler();
      Abspielgerät ag2 = new Abspielgerät(kp);
      ag2.play(5, data);

      System.out.println("\n---CD-Player mit Liste----");
      ArrayList<Integer> list = new ArrayList<>();
      for(int i = 1; i <= 10; i++) {
          list.add(i);
      }
     ListenAbspielgerät lg = new ListenAbspielgerät(cd, list);
      lg.playAndOff();


  }


}
