package cruz.models;

import java.util.HashSet;
import java.util.Set;

public class ProposedCombination extends Combination {
    public boolean isValidLength(String proposedString) {
		return proposedString.length()==this.LENGTH;
    }

    public boolean isValidColor(String proposedString) {
        String[] proposedArray = proposedString.split("");
        for (String item : proposedArray) {
            if(!Color.getAvailableColors().contains(item)){
                return false;
            }
        }
		return true;
    }

    public boolean isNotRepeatedColor(String proposedString) {
        Set<Character> chars = new HashSet<Character>();
        for (char c : proposedString.toCharArray()) {
            if (!chars.add(c)) return false;
        }
        return true;
    }
}
