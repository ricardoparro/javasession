public class QuickSortAlg{

	private static int[] arr; 
    private static int arraySize;

	public static void main(String[] args){

		arr = new int[]{0,0,0,0,0,1,2};

		for (int i = 0; i < arr.length; i++) {
			System.out.print("||" + i + "=>" + arr[i]);
		}
		System.out.println("");


		arraySize = arr.length;
		
		quickSortYeah(0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}


	public static void swap(int i , int j ){

		System.out.println("swapped index -> " + i + " value -> " + arr[i]  + " index -> " + j + " value -> " + arr[j] );

		int valueI = arr[i];
		int valueJ= arr[j];

		arr[i] = valueJ;
		arr[j] = valueI;
	}

	public static int partition(int left, int right){

		int pivot = arr[right];

		System.out.println("Pivot: " + pivot);

		while(true){

			while(arr[left] < pivot && left < arraySize){
				System.out.println("pointer left is in index: " + left);
				left++;
			};

			while(arr[right] > pivot && right  > 0){
				System.out.println("pointer right is in index: " + right);
				right--;
			}

			if(left == right || arr[left] == arr[right]){
				System.out.println("left is == right so start again");
	            break;
			}
	         else {
	            swap(left, right);
            }
        }

        if(right >= left)
        	return right;

        swap(left,right);

        return right;
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