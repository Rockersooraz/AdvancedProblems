package problems.advancedcalculator;

public class Utility {

    public static int getOperationIndex(String userInput) {
        int index = 0;
        if(userInput == null) return 0;
        if (userInput.contains("+")) {
            index = userInput.indexOf("+");
        } else if (userInput.contains("-")) {
            index = userInput.indexOf("-");

        } else if (userInput.contains("*")) {
            index = userInput.indexOf("*");

        } else if (userInput.contains("/")) {
            index = userInput.indexOf("/");
        }
        return index;
    }

}
