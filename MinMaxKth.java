import java.util.Scanner;

public class MinMaxKth {
	
	int partition(int arr[],int start,int end)
	{
		int povit=arr[end];
		int partitionIndex=start;
		for(int i=start;i<end;i++)
		{
			if(arr[i]<=povit)
			{
				int temp=arr[i];
				arr[i]=arr[partitionIndex];
				arr[partitionIndex]=temp;
				partitionIndex++;
			}
		}
		int temp=arr[partitionIndex];
		arr[partitionIndex]=arr[end];
		arr[end]=temp;
		
		return partitionIndex;
	}
	
	int kthMinimum(int[] arr, int k) {
	      int start = 0;
	      int end = arr.length - 1;
	      while (start <= end) {
	         int pivotIndex = partition(arr, start, end);
	         if (pivotIndex == k - 1) {
	            return arr[pivotIndex];
	         } else if (pivotIndex > k - 1) {
	            end = pivotIndex - 1;
	         } else {
	            start = pivotIndex + 1;
	         }
	      }
	      return -1; // k is out of bounds
	   }

	   int kthMaximum(int[] arr, int k) {
		   int start = 0;
		   int end = arr.length - 1;
		   while (start <= end) {
	         int pivotIndex = partition(arr, start, end);
	         if (pivotIndex == arr.length - k) {
	            return arr[pivotIndex];
	         } else if (pivotIndex < arr.length - k) {
	            start = pivotIndex + 1;
	         } else {
	            end = pivotIndex - 1;
	         }
	      }
	      return -1; // k is out of bounds
	   }

	   
	
	
				
		public static void main(String args[])
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements of array");
			int n=sc.nextInt();
			int list[]=new int[n];
			System.out.println("Enter array elements");
			for(int i=0;i<n;i++)
			{
				list[i]=sc.nextInt();
			}
			System.out.println("Enter k value  ");
			int k=sc.nextInt();
			MinMaxKth m1=new MinMaxKth();
			System.out.println("kth minumum element is "+m1.kthMaximum(list, k));
			System.out.println("kth minumum element is "+m1.kthMinimum(list, k));
			
		}

	}


