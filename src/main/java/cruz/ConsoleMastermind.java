package cruz;

import cruz.models.Game;
import cruz.views.MastermindView;
import cruz.views.console.ConsoleView;

public class ConsoleMastermind extends Mastermind {
    @Override
    protected MastermindView createView(Game game) {
        return new ConsoleView(game);
    }    
}
