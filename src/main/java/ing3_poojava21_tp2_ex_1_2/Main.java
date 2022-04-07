/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tp2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author amaaradji
 */
public class Main {
    public static void main(String[] args){
        PileEntiers 
                p1 = new PileEntiers(),
                p2 = new PileEntiers(), 
                p3 = new PileEntiers();
                
        int nb_element = 5;
        //initialisation de la pile avec 5 entiers aléatoires
        for (int i = 0; i < nb_element; i++)
            p1.Empiler((int) (Math.random()*100));
        
        // affichage
        System.out.print("p1 ");
        p1.afficher();
        
        System.out.print("p2 ");
        p3.afficher();
        
        System.out.print("p3 ");
        p3.afficher();
        
        //1- depiler p1 dans p3 utilisée comme pile intermediaire
        for (int i = 0; i < nb_element; i++) 
            p3.Empiler(p1.Depiler());
        
        //2- empiler dans p2 les éléments pairs, et "re-"empiler dans p1 (p1 est à l'identique qu'au départ)
        for (int i = 0; i < nb_element; i++) {
            int elem = p3.Depiler();
            p1.Empiler(elem);
            if (elem % 2 == 0) //pair
                p2.Empiler(elem);
        }
        
        //3- depiler p1 dans p2 utilisée comme pile intermediaire
        for (int i = 0; i < nb_element; i++) 
            p2.Empiler(p1.Depiler());
        
        //4- empiler dans p3 les éléments impairs, et "re-"empiler dans p1 (p1 est à l'identique qu'au départ)
        for (int i = 0; i < nb_element; i++) {
            int elem = p2.Depiler();
            p1.Empiler(elem);
            if (elem % 2 != 0) //impair
                p3.Empiler(elem);
        }
        
        //affichage
        System.out.print("p1 ");
        p1.afficher();
        
        System.out.print("p2 ");
        p2.afficher();
        
        System.out.print("p3 ");
        p3.afficher();
        
    }
}
