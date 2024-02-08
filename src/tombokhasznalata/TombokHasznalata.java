/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombokhasznalata;

/**
 *
 * @author BaksaBence(SZOFT_202
 */
public class TombokHasznalata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //indexek:
        //pyLista = ["egy", "kettő", "három"];
        
        String[] tomb = {"egy", "kettő", "három"};
        
        // memoria cimet irja ki, nem a tartalmat: * 
        System.out.println("tomb = " + tomb);
        
        // a tomb merete nem valtoztathato: * 
        // tomb = {"nulla", "egy", "kettő", "három"};
        System.out.println("A tömb elemei: ");
        for (int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        
        tomb = new String[4];
        for (int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        
        tomb[2] = "zwei";
        for (int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        
        System.out.println("Vegyesen feltöltött tömb: ");
        tomb[0] = "null";
        tomb[1] = "one";
        tomb[2] = "two";
        tomb[3] = "three";
        // tomb[4] = "";
        
        
        
        for (int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        
               
        System.out.println("Teljesen angolul feltöltött tömb: ");
        tomb[0] = "null";
        tomb[1] = "one";
        tomb[2] = "two";
        tomb[3] = "three";
        // tomb[4] = "";
        for (int i = 0; i < tomb.length; i++){
            System.out.printf("[%d. index] = %s\n", i, tomb[i]);
        }
        
        
        System.out.println("\"null\"vagy null ?");
        if ("null" == null){
            System.out.println("egyezik");
        }else{
            System.out.println("nem egyezik");
        }
    }
    
}
