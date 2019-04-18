public class Piece {
    private String name;
    private Square location;

    protected Piece(String name){
        this.name = name;
    }

    public Piece(String name, Square location){
        this.name = name;
        this.location = location;
    }


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
