/*
 -----------------------------------------------------------------------------------
 Laboratoire : Labo03
 Fichier     : Player.java
 Auteur(s)   : Bouyiatiotis - Gomes da Costa - Savary Alison
 Date        : 05.04.2019

 But         : Représente le joueur de la partie avec sa pièce et ses dés et le
 plateau de jeux

 Remarque(s) :

 Compilateur : MinGW-g++ 6.3.0
 -----------------------------------------------------------------------------------
 */

public class Player {
    private String name;
    private Piece piece;
    private Die[] die;
    private Board board;

    //constructeur
    public Player(String name, Die[] die, Board board){
        this.name = name;
        this.die = die;
        this.board = board;
        piece = new Piece(this.board.getPiece(), this.board.getStart());
    }

    //get et set
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    /**
     * @brief   : Fait jouer le joueur et lançant les deux dés et se déplacer
     */
    public void takeTurn(){
        int fv = 0;
        for (int i = 0; i < 2; ++i) {
            die[i].roll();
            fv += die[i].getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fv);
        piece.setLocation(newLoc);
    }

    @Override
    public String toString(){
        return name;
    }
}
