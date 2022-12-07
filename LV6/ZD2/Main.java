package LV6.ZD2;

import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Direktor di = new Direktor();
        Tajnica ta = new Tajnica();
        Vozac vo = new Vozac();

        di.setID(0);
        di.getID();
        di.setIme("Sinisa");
        di.getIme();
        di.setPrezime("Vuco");
        di.getPrezime();
        di.predstaviSe();
        di.radi();

        ta.setID(1);
        ta.getID();
        ta.setIme("Draska");
        ta.getIme();
        ta.setPrezime("Vukosavljevic");
        ta.getPrezime();
        ta.radi();

        vo.setID(2);
        vo.getID();
        vo.setIme("Zdravko");
        vo.getIme();
        vo.setPrezime("Mamic");
        vo.getPrezime();
        vo.radi();
    }
}
