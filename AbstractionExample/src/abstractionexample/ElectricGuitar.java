/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractionexample;

/**
 *
 * @author dwarfonfire
 */
public class ElectricGuitar extends StringedInstrument {

    public ElectricGuitar() {
        name = "Guitar";
        numberOfStrings = 6;
    }

    public ElectricGuitar(int gnumberOfStrings) {
        name = "Guitar";
        numberOfStrings = gnumberOfStrings;
    }
    
    public void play(){
        System.out.println("An electric " + numberOfStrings + "-string " + name+ " is rocking");
    }
}
