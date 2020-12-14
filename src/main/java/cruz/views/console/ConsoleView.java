package cruz.views.console;

import cruz.models.Game;
import cruz.utils.Console;
import cruz.views.MastermindView;
import cruz.views.Message;

public class ConsoleView extends MastermindView {
    private GameView gameView;

    public ConsoleView(Game game){
        super(game);
        gameView=new GameView(game);
    }

    protected void proposeGame(){
        gameView.interact();
    }

    @Override
    protected boolean isResume() {
        String answer;
        do
            answer = new Console().read(Message.RESUME.getMessage());
        while(!answer.equalsIgnoreCase("Y") && !answer.equalsIgnoreCase("N"));
        if (answer.equalsIgnoreCase("Y")){
            this.game.reset();
        }
        return answer.equalsIgnoreCase("Y");
    }
}
