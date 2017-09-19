public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a){
		sortHelper(a, 0, a.length - 1);
	}
	public int partition(int [] a, int high, int low) {
		int i = high;  
		int j = low;  
		int pivot = (high + low) / 2; 
		while (i <= j) {
			while (a[i] < a[pivot])
				i++;
			while (a[j] > a[pivot])
				j--;
			if (i <= j) {
				if (i == pivot)
					pivot = j;
				else if (j == pivot)
					pivot = i;
				swap(a, i++, j--);
			}
		}
		return i;
	}
	
	public void sortHelper(int [] a, int high, int low) {
		int pivot = partition(a, high, low);
		if (high < pivot - 1)  
			sortHelper(a, high, pivot - 1);
		if (pivot < low)  
			sortHelper(a, pivot, low);
	}

	private void swap(int[]a, int i, int j){
		int temp = 0;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
