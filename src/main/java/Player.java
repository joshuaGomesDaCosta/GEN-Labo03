public class Player {
    private String name;
    private Piece piece;
    //private Die[] die = new Die[2];
    //private Board board;

    public Player(String name){
        this.name = name;
    }

    public Player(String name, Piece piece){
        this.name = name;
        this.piece = piece;
    }

    /*
    public Player(String name, Piece piece, Board board){
        this(name, piece);
        this.board = board;
    }
    */

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

    /*
    public void takeTurn(){
        int fv = 0;
        for(int i = 0; i < 2; ++i){
            die[i].roll();
            fv += die[i].getFaceValue();
        }

        Square oldLoc = Piece.getLocation;
        Square newLoc = board.getSquare(oldLoc, fv);
        piece.setLocation(newLoc);

    }
    */

    @Override
    public String toString(){
        return name;
    }
}
