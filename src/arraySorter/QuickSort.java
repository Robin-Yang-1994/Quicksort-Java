package arraySorter;

	public class QuickSort<T extends Comparable<T>> extends ArraySortTool<T> {

		private T[] array;
		private int length;
			
		@Override
		public void sort(T[] array) {
			// TODO Auto-generated method stub
	        if (array == null || array.length == 0) { // checks array if no number being inputted, error message
	           System.out.print("No array is inputted");
	        }
	        this.array = array;
	        length = array.length;
	        QuickSort(0, length - 1); // the length of array decrement by one after quicksort method
	        						//Whie the array is not sorted ,the if statment is true. Which will run the quick sort method.
	    }
		       	
		public void QuickSort (int left, int right)
			  {
				int l = left; // left side
				int r = right; // right side
				int pivot = left; // pivot is equal to biggest number take smallest number divide by 2
												// finding the middle value
				 while (l <= r) 
				 {
					 while(array[l].compareTo(array[pivot]) < 0) // compare low with pivot and its result lesser then 0
					 {
		                 l++; // left side adds 1
					 }
					 while(array[r].compareTo(array[pivot]) > 0) // compare high with pivot and its result greater then 0
					 {
						 r--; // right side takes 1                    
					 }
					 if (l <= r) {
			                swap(l, r); // perform swap of low and high number the method below
			                l++;
			                r--;
					 }
					 }
			        if (left < r) 
			            QuickSort(left, r);
			        if (l < right)
			            QuickSort(l, right);
			    }

		private void swap(int l, int r) { // swaps the number like week 3 & 4
				T temp = array[l];
				array[l] = array[r];
				array[r] = temp;	
		}
			
		public static void main(String args[]){
			// TODO Auto-generated method stub
		        QuickSort qsort = new QuickSort();
		        Integer [] input = {0,3,2,1,5,4,4,12,0,3,87,23,56,322,45,2};
		        qsort.sort(input); // start sort for the input number
		        for(int l:input){	
		            System.out.print(l); // output smallest number
		            System.out.print(" ");
		     }
		}	
	}
		
