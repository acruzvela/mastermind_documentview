package cruz.views;

import cruz.models.Game;

public abstract class MastermindView {
    protected Game game;

    public MastermindView(Game game){
        this.game=game;
    }

    public void interact() {
        do {
            proposeGame();
    	}while(this.isResume());
    }

    protected abstract void proposeGame();
    protected abstract boolean isResume();
}
