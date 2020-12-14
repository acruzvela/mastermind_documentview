package cruz.views.console;

import cruz.models.Color;
import cruz.models.ProposedCombination;
import cruz.models.Error;
import cruz.utils.Console;
import cruz.views.Message;
import cruz.views.ErrorView;

public class ProposedCombinationView {
    private ProposedCombination proposedCombination;

	ProposedCombinationView(ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
    }

    public void read() {
        String proposedString;
        Console console=new Console();
        Error error;
		do {
            Message.ALLOWED_COLORS.write("#allowedcolors",Color.getAvailableColors());
            proposedString=console.read(Message.PROPOSED_COMBINATION.getMessage());
            error=this.isValid(proposedString);
        }while(!error.isNull());
		this.proposedCombination.createCombination(proposedString);
    }

    private Error isValid(String proposedString){
        Error error;
        for (Error errorItem: Error.values()){
            error=errorItem.isValid(proposedCombination, proposedString);
            if (!error.isNull()) {
                new ErrorView(error).writeln();
                return error;
			}
        }
        return Error.NULL_ERROR;
    }





    
}
