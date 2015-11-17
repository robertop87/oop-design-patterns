package chapter1.exercise1_23;

/**
 *
 * @author ivan
 */
public class TicTacToeBoard {
    
    char[][] board = new char[3][3];
    
    public TicTacToeBoard() {
        initBoard();
    }
    
    public boolean insertValue(int x, int y, Player ply1, Player ply2) {
        boolean result = false;
        
        if (isLegalMove(x, y)) {
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    
                    if ((j == y) && (i == x)) {
                        if (ply1.name.equals("Human")) {
                            board[i][j] = '0';
                        } else {
                            board[i][j] = 'X';
                        }
                    }
                }
            }
            
            ply1.changeTurn(ply2);
            result = true;
        }
        
        return result;
    }

    private boolean isLegalMove(int x, int y) {
        boolean result = true;
        
        if (((x < 0) || (2 < x)) && ((y < 0) || (2 < y))) { // if position is out of board
            result = false;
        } else if (!(getValue(x, y)).equals(' ')) { // if position was already taken
            result = false;
        }
        
        return result;
    }

    private Character getValue(int x, int y) {
        char boardValue = ' ';
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == x) && (j == y)) {
                    boardValue = board[x][y];
                }
            }
        }
        
        return boardValue;
    }

    private void initBoard() {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
    
    public void drawnBoard() {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j != 2){
                    System.out.printf(" %c |", board[i][j]);
                } else {
                    System.out.printf(" %c \n", board[i][j]);
                }
                
            }
            if (i != 2) {
                System.out.println("---+---+---");
            }
        }
    }
    
}
