public class Pawn {

    private boolean isWhite;
    private int y;
    private int x;

    public Pawn(boolean isWhite, int x, int y) {
        this.isWhite = isWhite;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    public boolean canMove(int x, int y) {
        if(isWhite && this.y - y == 1 && x == x)
            return true;
        else if(!isWhite && y - this.y == 1 && x == x)
            return true;
        else
            return false;
    }

    public void move(int x, int y) {
        if(this.canMove(x, y)) {
            this.x = x;
            this.y = y;
        }
        else
            System.out.println("Can't move there");
    }

    public String toString() {
        if(isWhite)
            return "♙ ";
        else
            return "♟︎ ";
    }
}