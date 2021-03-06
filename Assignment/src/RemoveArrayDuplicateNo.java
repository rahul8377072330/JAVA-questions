
public class RemoveArrayDuplicateNo {
	  static int removeDuplicates(int arr[], int n)
	    {
	        if (n==0 || n==1)
	            return n;
	      
	        int[] temp = new int[n];
	     
	        int j = 0;
	        for (int i=0; i<n-1; i++)
	            if (arr[i] != arr[i+1])
	                temp[j++] = arr[i];
	                temp[j++] = arr[n-1];   
	        for (int i=0; i<j; i++)
	            arr[i] = temp[i];
	      
	        return j;
	    }

	public static void main(String[] args) {
		
		int arr[] = {2,3,6,6,8,9,10,10,10,12,12};
        int n = arr.length;
         
        n = removeDuplicates(arr, n);
        for (int i=0; i<n; i++)
           System.out.print(arr[i]+" ");
	}

}
