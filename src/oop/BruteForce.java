/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class BruteForce {
    private Egyenlet egyenlet;
    private Megoldo[] megoldasok;

    public BruteForce(Egyenlet egyenlet) {
        this.egyenlet = egyenlet;
        megoldasok = new Megoldo[3];
    }
    
    public void megoldas() {
        int db = 0;
        for (int x = 1; x <= 28; x++) {
            for (int y = 1; y <= 98-x; y++) {
                for (int z = 3; z <= 72; z += 3) {
                    if (egyenlet.megoldasE(x, y, z)) {
                        megoldasok[db++] = new Megoldo(x, y, z);
                    }
                    
                }
            }
        }
    }
    
    public Megoldo[] getMegoldasok(){
        return megoldasok;
    }
}
