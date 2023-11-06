import java.util.Scanner;

public class CountingSort {
	CountingSort(int list[],int n)
	{
		int output[]=new int[n];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(max<list[i])
				max=list[i];
		}
		int count[]=new int [max+1];
		for(int i=0;i<n;i++)
			count[list[i]]++;
		for(int i=1;i<=max;i++)
			count[i]=count[i]+count[i-1];
		for(int i=n-1;i>=0;i--)
		{
			output[count[list[i]]-1]=list[i];
			count[list[i]]--;
		}
		for(int i=0;i<n;i++)
		{
			list[i]=output[i];
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
	new CountingSort(list,n);
	System.out.println("Array after sorting");
	for(int i=0;i<n;i++)
	{
		System.out.print(list[i]+" ");
	}
	
}

}

