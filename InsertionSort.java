import java.util.Scanner;

public class InsertionSort {
	InsertionSort(int arr[],int size)
	{
		int i,j,key;
		for(j=1;j<size;j++)
		{
			key=arr[j];
			i=j-1;
			while(i>=0 && arr[i]>key)
			{
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=key;
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
		new InsertionSort(list,n);
		System.out.println("Array after sorting");
		for(int i=0;i<n;i++)
		{
			System.out.print(list[i]+" ");
		}
		
	}

}


