
package cruz.models;

public enum Error {
	LENGTH{
        public Error isValid(ProposedCombination proposedCombination, String proposedString) {
            return !proposedCombination.isValidLength(proposedString)?
                this:Error.NULL_ERROR;
        }
    },
	WRONG_COLOR{
        public Error isValid(ProposedCombination proposedCombination, String proposedString) {
            return !proposedCombination.isValidColor(proposedString)?
                this:Error.NULL_ERROR;
        }
    },
	REPEATED_COLOR{
        public Error isValid(ProposedCombination proposedCombination, String proposedString) {
            return !proposedCombination.isNotRepeatedColor(proposedString)?
                this:Error.NULL_ERROR;
        }
    },
    NULL_ERROR{
        public Error isValid(ProposedCombination proposedCombination, String proposedString) {
            return this;
        }
    };

    public abstract Error isValid(ProposedCombination proposedCombination, String proposedString);

    public boolean isNull() {
		return this == Error.NULL_ERROR;
	}
}