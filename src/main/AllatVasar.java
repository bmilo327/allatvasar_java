/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class AllatVasar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 3.5;
        double b = 0.5;
        double c = 4.0/3;
        int allatSzam = 100;
        int aranySzam = 100;
        int joDb = 0;
        int dbOssz = 0;
        for (int x = 1; x <= 28; x++) {
            for (int y = 1; y <= 98-x; y++) {
                for (int z = 3; z <= 72; z += 3) {
                    if ((a * x + b * y + c * z == aranySzam) && (x + y + z == allatSzam)) {
                        System.out.printf("sertés %d db, kecske %d db, juh %d db\n", x, y, z);
                        joDb++;
                    }
                    dbOssz++;
                }
            }
        }
        System.out.println(dbOssz);
        System.out.println(joDb);
    }
    
}
