package chapter1.exercise1_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ivan
 */
public class TicTacToeGame {
    
    Player          ply1 = new Player("Human");
    Player          ply2 = new Player("Computer");
    TicTacToeBoard  tttb = new TicTacToeBoard();
    String          coin = "";
    boolean         isThereWinner = false;
    
    public void startGame() throws IOException {
        System.out.print("Which coin side do you want? head or tail?: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String chooseSide = br.readLine();
        
        if (throwCoin(chooseSide)) {
            ply1.setTurn(true);
        } else {
            ply2.setTurn(true);
        }
        
        int counter = 0;
        while ((counter < 9) || isThereWinner) {
            tttb.drawnBoard();
            
            if (ply1.isMyTurn) {
                getHumanGame();
            } else if (ply2.isMyTurn) {
                getComputerGame();
            }
            
            counter++;
        }
        
        if (isThereWinner) {
            System.out.println("And the Winner is: ");
            if (ply1.isWinner) {
                System.out.println(ply1.name);
            } else {
                System.out.println(ply2.name);
            }
        } else if (counter == 9) {
            System.out.println("DRAW GAME!!!");
        }
    }
    
    public boolean throwCoin(String sideCoin) {
        boolean result = false;
        if (((int)(Math.random()*10 + 1)) < 6) {
            coin = "head";
        } else {
            coin = "tail";
        }
        
        if(sideCoin.equals(coin)) {
            result = true;
        }
        
        return result;
    }

    private void getHumanGame() throws IOException {
        boolean isGoodMove = false;
        
        while (!isGoodMove) {
            System.out.print("Please enter a position x for row and y for column, "
                + "between 0 and 2, for example 2,2: ");
        
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] position = br.readLine().split(",");
            isGoodMove = tttb.insertValue(Integer.parseInt(position[0]), 
                    Integer.parseInt(position[1]), ply1, ply2);    
        }
        
    }

    private void getComputerGame() {
        boolean isGoodMove = false;
        int posx = 0;
        int posy = 0;
        
        while (!isGoodMove) {
            posx = (int)(Math.random()*2);
            posy = (int)(Math.random()*2);
            
            isGoodMove = tttb.insertValue(posx, posy, ply2, ply1);
        }
    }
    
}
