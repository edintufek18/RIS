import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ggg {
static KResiKviz resi = new KResiKviz();

static ZmResiKviz kviz = new ZmResiKviz();
public  String []  quest = {"Are you focusing on the positive?","Are you emotional unstable?","Do you have intensifying attraction"};
public static   String []  ques = {"Are you focusing on the positive?","Are you emotional unstable?","Do you have intensifying attraction"};



    public static void main(String[] args) {


          kviz.zacniResevanje();
          resi.vrniSeznamVprasanja(ques);
          kviz.prikaziVprasanja();
          kviz.odgovoriVprasanja();
          resi.izracunaj();

    }
}
