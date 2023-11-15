import java.util.*;
public class BubbleSort {
	BubbleSort(int arr[],int n)
	{
		int temp;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
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
		new BubbleSort(list,n);
		System.out.println("Array after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(list[i]+" ");
		}
		
	}

}

