package arraySorter;

/**
 * Defines the interface for array sorting algorithms
 * 
 * @author Hugh Osborne
 * @version October 2008
 */

public interface ArraySort<T extends Comparable<T>>
{
   
	
	
    public void sort(T[] array);
}