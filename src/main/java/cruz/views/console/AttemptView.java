package cruz.views.console;

import cruz.models.Game;
import cruz.models.ProposedCombination;
import cruz.models.Result;
import cruz.models.Attempt;

public class AttemptView {
    private Game game;

    public AttemptView(Game game){
        this.game=game;
    }

    public void interact() {
        ProposedCombination proposedCombination = new ProposedCombination();
        ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposedCombination);
		proposedCombinationView.read();
        Result result = game.getSecretCombination().evalueCombination(proposedCombination);
        Attempt attempt=new Attempt(proposedCombination,result);
        this.game.addAttempt(attempt);
    }
}
