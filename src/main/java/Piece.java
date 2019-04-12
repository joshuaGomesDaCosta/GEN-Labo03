public enum Piece {
    deACoudre("Dés à coudre",1),
    brouette("Brouette",2),
    botte("Botte",3),
    chien("Chien",4),
    voiture("Voiture",5),
    ferARepasser("Fer à repasser",6),
    chapeau("Chapeau",7),
    bateau("Bateau",8);

    private final String name;
    private final int id;
    //private Square location;

    Piece(String name, int id){
        this.name = name;
        this.id = id;
    }
    /*
    Piece(String name, int id, Square location){
        this(name, id);
        this.location = location;
    }
    */
    public Piece getPiece(){
        return this;
    }

    public int getId(){
        return id;
    }
    /*
    public void setLocation(Square location) {
        this.location = location;
    }

    public Square getLocation() {
        return location;
    }
    */

    @Override
    public String toString(){
        return name;
    }

}
