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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto newCar = new Auto("K-FR-5678", 130);
        newCar.status();
        newCar.beschleunige(23.4);
        System.out.print(newCar.getGeschwindigkeit());
        System.out.print("\n");
        newCar.beschleunige(1337.0);
        System.out.print(newCar.getGeschwindigkeit());
        System.out.print("\n");
    }
    
}
