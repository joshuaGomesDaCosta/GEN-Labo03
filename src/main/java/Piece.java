/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : Piece.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary Alison
 Date        : 05.04.2019

 But         : Pièce possédé par le joueur

 Remarque(s) :

 Compilateur : MinGW-g++ 6.3.0
 -----------------------------------------------------------------------------------
 */

public class Piece {
    private String name;
    private Square location;

    //Constructeur
    protected Piece(String name){
        this.name = name;
    }

    public Piece(String name, Square location){
        this.name = name;
        this.location = location;
    }

    //get et set
    public Piece getPiece(){
        return this;
    }

    public void setLocation(Square location) {
        this.location = location;
    }

    public Square getLocation(){
        return location;
    }

    @Override
    public String toString(){
        return name;
    }

}
