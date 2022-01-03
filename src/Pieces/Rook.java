public class Rook{

    private boolean isWhite;
    private int y;
    private int x;

    public Rook(boolean isWhite, int x, int y) {
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
        if(x > 7 || y > 7)
            return false;
        if((x == this.x && y != this.y) || (x != this.x && y == this.y)
            return true;
        else
            return false;
    }



    public String toString() {
        if(isWhite)
            return "♖ ";
        else
            return "♜ ";
    }
}