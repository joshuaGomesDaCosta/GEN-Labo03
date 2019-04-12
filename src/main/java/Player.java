public class Player {
    private String name;
    private Piece piece;
    private Die[] die;
    private Board board;

    public Player(String name, Die[] die, Board board){
        this.name = name;
        this.die = die;
        this.board = board;
        piece = new Piece(this.board.getPiece(), this.board.getStart());
    }

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
