public class QuickSort{

	private static int[] arr; 
    private static int arraySize;

	public static void main(String[] args){

		arr = new int[]{65,70,75,80,85,60,55,50,45};
		arraySize = arr.length;

		QuickSort quickSort = new QuickSort();
		quicksort.quickSortYeah(0, arr.length - 1);

		for (int i = 0; i < arr.length -1; i++) {
			System.out.println(arr[i]);
		}
	}


	public void swap(int i , int j ){

		System.out.println("swapped index -> " + i + " value -> " + arr[i]  + " index -> " + j + " value -> " + arr[j] );

		int valueI = arr[i];
		int valueJ= arr[j];

		arr[i] = valueJ;
		arr[j] = valueI;
	}

	public int partition(int left, int right){

		int pivot = this.arr[right];

		while(true){

			while(arr[left++] < pivot && left < arraySize);

			while(arr[right--] < pivot && right  > 0);

			if (left >= right) {
	 
	             System.out.println("left is >= right so start again");

	             break;
	         }
	         else {
	            swap(left, right);
            }
        }
	}

	public static void quickSortYeah(int left, int right){

		int q;

		if(right > left){

			q = partition(left, right);

			//after partition
			//-> A[left..q-1] <= A[q] <= A[q+1..right]

			quickSortYeah(left, q-1);
			quickSortYeah(q+1, right);
		}
	}
}