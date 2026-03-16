/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class Egyenlet {
    private final double a, b, c;
    private final int penzOsszeg, allatOsszeg;

    public Egyenlet(double a, double b, double c, int penzOsszeg, int allatOsszeg) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.penzOsszeg = penzOsszeg;
        this.allatOsszeg = allatOsszeg;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public int getOsszeg() {
        return penzOsszeg;
    }

    public int getAllatOsszeg() {
        return allatOsszeg;
    }
    
    public boolean megoldasE(int x, int y, int z){
        return (a * x + b * y + c * z == penzOsszeg) && (a + b + c == allatOsszeg);
    }
}
