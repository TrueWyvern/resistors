/* 
 * Aisik Pilote
 * resistor value based on colour bands.
 * user inputs colour to represent the band on a resitor and the prgram calculates the value of the resistor.
 */

package resistors;

import javax.swing.JOptionPane;

/**
 *
 * @author aipil3692
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                //front end
                String colours = JOptionPane.showInputDialog(
                "Input three colours of bands on resistors seperated by hyphens ex: red-green-blue.\n"
                + "Colours include: Black(0), Brown(1), Red(2), Orange(3), Yellow(4), Green(5), Blue(6), Violet(7), Grey(8), White(9)\n");        
                
                //split colours and init array
                String[] resistor = colours.toLowerCase().split("-");
                //assign value to each colour
                for(int i = 0; i < resistor.length; i++) {
                    resistor[i] = resistor[i].replace("black","0").replace("brown","1").replace("red","2").replace("orange","3").replace("yellow","4").replace("green","5").replace("blue","6").replace("violet","7").replace("grey","8").replace("white","9");
                }
                    //calculate value
                    double finalValue = Integer.parseInt(resistor[0] + resistor[1])*Math.pow(10, Integer.parseInt(resistor[2]));
                    System.out.println(finalValue);
    }
    
}
