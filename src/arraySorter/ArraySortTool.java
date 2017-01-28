package arraySorter;
import timer.Timer;


/**
 * Adds a time method to array sorter classes to report the time taken for a sort
  * 
 * @author Hugh Osborne
 * @version October 2008
 */
public abstract class ArraySortTool<T extends Comparable<T>> extends Timer implements ArraySort<T>
{
    /**
     * @param inArray an array to be sorted
     * @return the time taken to sort the array
     */
    public double time(T[] array) {
        double startTime = System.currentTimeMillis();
        sort(array);
        return ((System.currentTimeMillis()-startTime)/1000.0);
    }
    
    /**
     * Check whether a given array is sorted.
     * @param array the array to be checked
     * @return true iff the array is sorted - either ascending or descending
     * The first non-equal neighbouring elements will determine the expected
     * order of sorting.
     */
    public boolean isSorted(T[] array) {
        int detectedDirection = 0; // have not yet detected increasing or decreasing
        T previous = array[0];
        for (int index = 1; index < array.length; index++) {
            int currentDirection = previous.compareTo(array[index]); // compare previous and current entry
            if (currentDirection != 0) { // if current pair increasing or decreasing
                if (detectedDirection == 0) { // if previously no direction detected
                    detectedDirection = currentDirection; // remember current direction
                } else if (detectedDirection * currentDirection < 0) { // otherwise compare current and previous direction
                    return false; // if they differ array is not sorted
                }
            }
            previous = array[index];
        }
        // reched end of array without detecting pairs out of order
        return true;
    }
}