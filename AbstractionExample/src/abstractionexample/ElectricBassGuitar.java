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
public class ElectricBassGuitar extends StringedInstrument {

    public ElectricBassGuitar() {
        name = "Bass Guitar";
        numberOfStrings = 4;
    }

    public ElectricBassGuitar(int numberOfStrings) {
        name = "Bass Guitar";
        this.numberOfStrings = numberOfStrings;
    }
    
    public void play(){
        System.out.println("An electric " + numberOfStrings + "-string" + name + " is booming!");
    }
}
