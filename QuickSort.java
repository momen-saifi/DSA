import java.util.Scanner;

public class QuickSort {
	
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

	void quickSortAlgo(int arr[],int start,int end)
	{
		if(start<end)
		{
			int partitionIndex=partition(arr,start,end);
			quickSortAlgo(arr,start,partitionIndex-1);
			quickSortAlgo(arr,partitionIndex+1,end);
			
		}

	}
	
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int list[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			list[i]=sc.nextInt();
		}
		System.out.println("Array befour sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(list[i]+" ");
		}
		System.out.println();
		new QuickSort().quickSortAlgo(list, 0, n-1);
		System.out.println("Array after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(list[i]+" ");
		}
		
	}

}


