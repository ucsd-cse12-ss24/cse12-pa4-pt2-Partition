
// These are some imports that the course staff found useful, feel free to use them
// along with other imports from java.util.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PartitionOracle {

    /**
     * Feel free to use this method to call partition. It catches any exceptions or
     * errors and returns a definitely-invalid pivot (-1) to turn errors into
     * potential failures. For example, in testPartition, you may use
     * 
     * runPartition(p, someArray, someLow, someHigh)
     * 
     * instead of
     * 
     * p.partition(someArray, someLow, someHigh)
     * 
     * @param p - the pivot
     * @param strs - the array
     * @param low - the low
     * @param high - the high
     * @return - a definetly invalid pivot (-1)
     */
    public static int runPartition(Partitioner p, String[] strs, int low, int high) {
        try {
            return p.partition(strs, low, high);
        } catch (Throwable t) {
            return -1;
        }
    }

    // The three methods below are for you to fill in according to the PA writeup.
    // Feel free to make other helper methods as needed.

    /**
     * @Return null if the pivot and after array reflect a correct partitioning of 
     * the before array between low and high.
     * 
     * @Return a non-null String (your choice) describing why it isn't a valid
     * partition if it is not a valid result. 
     * 
     * You might choose Strings like these, though there may be more you want to report:
     * - "after array doesn't have same elements as before"
     * - "Item before pivot too large"
     * - "Item after pivot too small"
    */
    public static String isValidPartitionResult(String[] before, int low, int high, int pivot, String[] after) {
        return null;
    }

    /**
     * Generate a list of items of size n
     */
    public static String[] generateInput(int n) {
        return new String[0];
    }

    /**
     * 
     * @return - null for any reasonable good partition implementation.
     * @return - a CounterExample for any bad partition implementation.
     */
    public static CounterExample findCounterExample(Partitioner p) {
        return null;
    }
}