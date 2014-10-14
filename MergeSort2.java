class MergeSort2{

    public static void main(String[] args){
	
	int[] arrayToMerge = new int[]{45,66,7,8,444,3,5,66,7,1,9,3,55,6,7};

        mergeSort(arrayToMerge, 0 , arrayToMerge.length-1);

        for(int i=0; i < arrayToMerge.length; i++){
            System.out.println(" -> " + arrayToMerge[i]);
        }
    }

    public static void mergeSort(int[] arr, int start, int end){
	
	if(start < end){
	    int mid = (start + end) /2;
	    mergeSort(arr,start, mid);
	    mergeSort(arr, mid + 1, end);
	    mergeArray(arr, start, mid, end);
	}
	
    }

    public static void mergeArray(int[] arr, int start, int mid, int  end){
	
	int[] temp = new int[end - start + 1];

	int i= start, j = mid + 1 , k = 0;

	while(i <= mid && j <= end){
	    
	    if(arr[i] < arr[j]){
		temp[k] = arr[i];
		k++;
		i++;
	    }
	    else
	     {
		 temp[k] = arr[j];
		 k++;
		 j++;
	     }
	}

	while(i <= mid){
	    temp[k] = arr[i];
	    k++;
	    i++;
	}
	
	while (j <= end){
	    temp[k] = arr[j];
	    k++;
	    j++;
	}
	
	i= start;
	k=0;
	while (k < temp.length && i <= end){
	    arr[i] = temp[k];
	    i++;
	    k++;
	    }    
    }
} 