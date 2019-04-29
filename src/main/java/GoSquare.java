/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : GoSquare.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary Alison
 Date        : 05.04.2019

 But         : case régulière de jeux du board

 Remarque(s) :

 Compilateur : MinGW-g++ 6.3.0
 -----------------------------------------------------------------------------------
 */

public class GoSquare extends Square{

    public GoSquare(String nom){
        super(nom);
    }

    public void landedOn( Player p){
        p.addCash(200);
    }
}
