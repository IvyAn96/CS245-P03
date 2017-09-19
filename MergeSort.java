
public class MergeSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		sortHelper(a, 0, a.length - 1);
  
	}
	public void sortHelper(int[] a, int left, int right){
		if( left < right){
			int middle = (left + right) / 2;
			sortHelper(a, left, middle);
			sortHelper(a, middle + 1, right);
			merge(a, left, middle, right);
		}
	}
	
	public void merge(int arr[], int l, int m, int r)
	{
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		//Create temp arrays 
		int L[] = new int [n1];
		int R[] = new int [n2];

		//Copy data to temp arrays*/
		for (int i=0; i<n1; ++i)
			L[i] = arr[l + i];
		for (int j=0; j<n2; ++j)
			R[j] = arr[m + 1+ j];


		//Merge the temp arrays

		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2)
		{
			if (L[i] <= R[j])
			{
				arr[k] = L[i];
				i++;
			}
			else
			{
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1)
		{
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2)
		{
			arr[k] = R[j];
			j++;
			k++;
		}
	}
}
