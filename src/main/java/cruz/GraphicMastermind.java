package cruz;

import cruz.models.Game;
import cruz.views.MastermindView;
import cruz.views.graphic.GraphicView;

public class GraphicMastermind extends Mastermind {
    @Override
    protected MastermindView createView(Game game) {
        return new GraphicView(game);
    }
}
