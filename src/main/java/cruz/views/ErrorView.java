package cruz.views;

import cruz.utils.Console;
import cruz.models.Error;
import cruz.models.Color;

public class ErrorView {
  private static final String[] MESSAGES = { 
    "Wrong proposed combination length",
    "Wrong colors they must be: "+Color.getAvailableColors(), 
    "Wrong proposed, can not repeat color." };

  private Error error;

	public ErrorView(Error error) {
		this.error = error;
	}
	
	public void writeln() {
		if(!this.error.isNull()) {
			new Console().write(ErrorView.MESSAGES[this.error.ordinal()]+"\n");
		}
	}
}
