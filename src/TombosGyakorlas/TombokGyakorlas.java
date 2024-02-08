/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TombosGyakorlas;

/**
 *
 * @author BaksaBence(SZOFT_202
 */
public class TombokGyakorlas {
    
    public static void main(String[] args){
        /*String[] nevek = {"Rókarudi", "Rókarudibarátja", "Rókarudiutálója", "Rókarudiszeretője"};
        Integer[] korok = {27, 25, 11, 12};
        for (int i = 0; i < nevek.length; i++){
            System.out.printf("[%d. neve] = %s\n", i, nevek[i]);
        }
        for (int i = 0; i < korok.length; i++){
            System.out.printf("[%d. kora] = %s\n", i, korok[i]);
        }
      */  //nem tudjuk az adatokat:
        final int TOMB_MERET = 4;
        String[] nevek;
        int[] korok;
        
        nevek = new String[TOMB_MERET];
        nevek[0] = "Rókarudi";
        nevek[1] = "Rókarudi";
        nevek[2] = "Rókarudi";
        nevek[3] = "Rókarudi";
        
        korok = new int[TOMB_MERET];
        korok[0] = 27;
        korok[1] = 25;
        korok[2] = 12;
        korok[3] = 11;
        
        System.out.println("Versenyzők kora: ");
        int osszkor = 0;
        for (int i = 0; i < TOMB_MERET; i++){
            String nev = nevek[i];
            int kor = korok[i];
            System.out.printf("%5s kora: %d év\n", nev, kor);
            osszkor += kor;
        }
        
        double atlag = (double)osszkor / TOMB_MERET;
        System.out.printf("A versenyzők átlag kora: %.2f év\n", atlag);
    }
}
