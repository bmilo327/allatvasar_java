/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author BernáthMilán(SZF_N_2
 */
public class Megoldo {
    private int x, y, z;

    public Megoldo(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String allapot() {
        return "Megoldás{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }  
}
