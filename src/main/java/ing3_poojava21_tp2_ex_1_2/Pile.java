/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ing3_poojava21_tp2_ex_1_2;

/**
 *
 * @author amaaradji
 */
public class Pile {
    protected Liste maListe;

    public Pile() {
        maListe = new Liste();
    }
    
    public void Empiler(Object obj){
        maListe.Dernier();
        maListe.Ajouter(obj);
    }
    
    public Object Depiler(){
        maListe.Dernier();
        return maListe.Supprimer();
    }
}
