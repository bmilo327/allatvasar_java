/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class Program {
    public static void main(String[] args) {
        Egyenlet egyenlet;
        egyenlet = new Egyenlet(3.5, 0.5, 4.0/3, 100, 100);
        
        BruteForce megoldo = new BruteForce(egyenlet);
        megoldo.megoldas();

        for (Megoldo megoldas : megoldo.getMegoldasok()) {
            System.out.println(megoldas.allapot());
        }
    }
}
