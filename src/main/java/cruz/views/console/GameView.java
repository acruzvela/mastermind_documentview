package cruz.views.console;

import cruz.models.Attempt;
import cruz.models.Game;
import cruz.utils.Console;
import cruz.views.Message;

public class GameView {
    private Game game;
    private AttemptView attemptView;

    public GameView(Game game){
        this.game=game;
        attemptView=new AttemptView(game);
    }

    public void interact() {
        Message.TITLE.write();
        do {
            printHeadAttempts();
            this.attemptView.interact();
            printAttempts();
        }while(haveMoreAttempts());
        finish();
    }

    private void printHeadAttempts(){
      Message.ATTEMPTS.write(this.game.getAttempts().size());
      Message.SECRET_COMBINATION.write();
    }

    private void printAttempts() {
        Console console=new Console();
        for(Attempt attempt: this.game.getAttempts()) {
          Message.RESULT.write(attempt.getProposedCombination().toString(),
          attempt.getResult().getBlacks(),attempt.getResult().getWhites());
        }
        console.write("\n");
      }

    public boolean haveMoreAttempts() {
        return !game.lastAttempt().isWinner() && this.game.getAttempts().size() < Game.ATTEMPTS_NUMBER;
    }
  
    private void finish(){
        if(game.lastAttempt().isWinner()) {
          Message.WINNER.write();
        }else {
          Message.LOSER.write("#secretcombination",this.game.getSecretCombination().toString());
        }
    }
}