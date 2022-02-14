import java.util.ArrayList;

public class Delimiters {
    /**
     * The open and close delimiters
     **/
    private String openDel;
    private String closeDel;

    /**
     * Constructs a Delimiters object where open is the open delimiter and close is the
     * close delimiter.
     * Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /**
     * Returns an ArrayList of delimiters from the array tokens, as described in part (a).
     */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delimiterList = new ArrayList<>();
        for (String string : tokens) {
            if (string.equals(openDel) || string.equals(closeDel)) {
                delimiterList.add(string);
            }
        }
        return delimiterList;
    }

    /**
     * Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     * Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        int openCount = 0;
        int closeCount = 0;
        for (String delimiter : delimiters) {
            if (delimiter.equals(openDel)) {
                openCount++;
            }
            if (delimiter.equals(closeDel)) {
                closeCount++;
                if (closeCount > openCount) {
                    return false;
                }
            }
        }
        return openCount == closeCount;
    }
}