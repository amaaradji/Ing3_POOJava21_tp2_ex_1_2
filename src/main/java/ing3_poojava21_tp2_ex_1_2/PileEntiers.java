/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ing3_poojava21_tp2_ex_1_2;

/**
 *
 * @author amaaradji
 */
public class PileEntiers extends Pile {
    
    public Integer Depiler(){
        Integer i = (Integer)super.Depiler();
        return i;
    }
    
    void afficher(){
        maListe.afficher();
    }
}
