public class SelectionSort implements SortingAlgorithm {


	@Override
	public void sort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min = i;
			for (int j = i+1; j < n; j++)
				if (a[j] < a[min])
					min = j;

			// Swap the found minimum element with the first element
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}
}
	
