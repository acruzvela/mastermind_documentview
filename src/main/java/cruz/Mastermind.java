package cruz;

import cruz.models.Game;
import cruz.views.MastermindView;

/**
 * Hello world!
 *
 */
public abstract class Mastermind 
{
  private Game game;
  private MastermindView mastermindView;

  protected Mastermind() {
		this.game = new Game();
		this.mastermindView = this.createView(this.game);
  }
  
  protected abstract MastermindView createView(Game game);
 
  protected void play() {
		this.mastermindView.interact();
  }
  
  public static void main(String[] args) {
    if(args[0].equals("console")){
      new ConsoleMastermind().play();
    }
    else if (args[0].equals("graphic")){
      new GraphicMastermind().play();
    }
  }
}
