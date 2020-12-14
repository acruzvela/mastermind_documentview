package cruz.views.graphic;

import cruz.models.Game;
import cruz.views.MastermindView;

public class GraphicView extends MastermindView {
    private GameView gameView;

    public GraphicView(Game game){
        super(game);
        gameView=new GameView(game);
    }

    @Override
    protected void proposeGame() {
        gameView.interact();
    }

    @Override
    protected boolean isResume() {
        return false;
    }
}
