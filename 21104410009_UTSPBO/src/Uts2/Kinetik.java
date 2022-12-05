/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Uts2;

/**
 *
 * @author Hilga Satria Pambudi
 * TI-A
 */
public class Kinetik extends MainEnergi{
    
    public double ek;
    private double kecepatan;
    private double massa;

    public double getKecepatan() {
        return 0;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getMassa() {
        return 0;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getEk(double ek) {
        ek = 1/2*massa*kecepatan;
        return ek;
    }

    public void setEk(double ek) {
        this.ek = ek;
    }

    
   
   
}
