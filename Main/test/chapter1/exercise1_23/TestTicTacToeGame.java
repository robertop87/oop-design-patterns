package chapter1.exercise1_23;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;

/**
 *
 * @author ivan
 */
public class TestTicTacToeGame {
    
    @Test
    public void testStartGame() {
        TicTacToeGame tttg = new TicTacToeGame();
        
        try {
            tttg.startGame();
        } catch (IOException ex) {
            Logger.getLogger(TestTicTacToeGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
