/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : Square.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary Alison
 Date        : 05.04.2019

 But         : case de jeux du board

 Remarque(s) :

 Compilateur : MinGW-g++ 6.3.0
 -----------------------------------------------------------------------------------
 */

public class Square {
    private String name;

    //Constructeur
    public Square(String name) {
        this.name = name;
    }

    //Get
    public String getName() {
        return name;
    }
}
