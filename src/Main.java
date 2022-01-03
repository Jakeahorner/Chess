import java.util.*;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello Gamer");
        CB.startGame();
        CB.updateArray();
        //CB.print();
        pawnW1.move(0, 5);
       ////CB.updateArray();
        /////CB.print();
        
    }

    public int getCoord(char myChar) {
        int xIndex;
        char[] xAxis = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        for (int i = 0; i < 8; i++) {
            if (myChar == xAxis[i]) {
                xIndex = i;
            }
        }
        return xIndex;
    }

}