/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20141023_auto;

/**
 *
 * @author Ragnos
 */
public class Auto {
    String Kennzeichen;
    double vcur;
    final double vmax = 200;
    
    public Auto()
    {
        //TODO
    }
    
    public Auto(String kenn, int vnew)
    {
        Kennzeichen = kenn;
        if(vnew <= vmax)
            vcur = vnew;
        else
            vcur = vmax;
    }
    
    public void status()
    {
        System.out.print("Kennzeichen:\t");
        System.out.print(Kennzeichen);
        System.out.print("\nvcur\t\t");
        System.out.print(vcur);
        System.out.print("\n");
    }
    
    public double getGeschwindigkeit(){ return vcur; }
    public void beschleunige(double a){ if( a < vmax - vcur) vcur += a; else vcur = vmax;}
}
