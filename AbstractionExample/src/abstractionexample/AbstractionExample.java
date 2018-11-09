/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionexample;

/**
 *
 * @author dwarfonfire 16007873
 * A class to test the functions of the other classes
 */
public class AbstractionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ElectricGuitar guitar = new ElectricGuitar();
        ElectricBassGuitar bassGuitar = new ElectricBassGuitar();
        
        guitar.play();
        bassGuitar.play();

        System.out.println("New class creations");
        
        guitar = new ElectricGuitar(7);
        bassGuitar = new ElectricBassGuitar(5);
        
        guitar.play();
        bassGuitar.play();
    }

}
