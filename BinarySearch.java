import java.util.Scanner;

public class BinarySearch {
	BinarySearch(int arr[],int size,int item)
	{
		int l,u,mid;
		l=0;
		u=size-1;
		while(l<=u)
		{
			mid=(u+l)/2;
			if(arr[mid]==item)
			{
				System.out.println(item+ " is found in the list at "+(mid+1)+" index");
				return;
			}
			else if(arr[mid]>item)
			{
				u=mid-1;
			}
			else if(arr[mid]<item)
			{
				l=mid+1;
			}
			
		}
		System.out.println(item+ " is not found in the list");		
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
		System.out.println();
		System.out.println("Enter the element which went to search elements");
		int key=sc.nextInt();
		new BinarySearch(list,n,key);
		
	}

}