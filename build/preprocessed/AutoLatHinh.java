/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;

/**
 *
 * @author ACER
 */
public class AutoLatHinh implements Runnable {

    public static long time = 10L;
    public final int solanlat;
    public static int lap;
    public static int check;
    public static int id;
    public static boolean bat;
    public static boolean chay;
    public static Random random = new Random();

    AutoLatHinh(int a) {
        this.solanlat = a;
    }

    public final void run() {
        int n6 = 0;
        if (TileMap.mapID != 72) {
            GameScr.paint("Đứng ở Okaza để auto");
            GameScr.paint(String.valueOf(check));
        } else {
            n6 = 0;
            GameScr.pickNPC(30, 0, 0);

            do {
                ++n6;
                Service.gI().selectCard();
                GameCanvas.startWaitDlg();

                try {
                    Thread.sleep(time);
                } catch (InterruptedException var3) {
                    var3.printStackTrace();
                }
            } while (n6 <= this.solanlat);

        }
    }
}
