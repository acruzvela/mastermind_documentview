package cruz.views.graphic;

import javax.swing.JFrame;
import java.awt.GridBagLayout;

import cruz.models.Game;

@SuppressWarnings("serial")
public class GameView extends JFrame{
    private Game game;
    
    public GameView(Game game){
        this.game=game;
        this.getContentPane().setLayout(new GridBagLayout());
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
    }
    
    public void interact() {
        game.reset();
    }
}
