package problems.advancedcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public static List<Double> shiftInputArrayList(List<Double> array, int positions) {
        Double[] shiftedArray = new Double[array.size()];
        int j = 0;
        int indexPosition = array.size() - positions;
        for (int i = 0; i < array.size(); i++) {
            shiftedArray[j] = array.get(indexPosition);
            if (j < array.size() - 1) {
                j++;
            }
            indexPosition++;
            if (indexPosition > array.size() - 1) {
                indexPosition = 0;
            }
        }
        return Arrays.asList(shiftedArray);
}

}
